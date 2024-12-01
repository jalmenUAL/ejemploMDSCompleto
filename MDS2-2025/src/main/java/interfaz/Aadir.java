package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.usuario;
import vistas.VistaAadir;

public class Aadir extends VistaAadir {
	public ListaUsuario _listaUsuario;

	Aadir(ListaUsuario listausuario) {
		_listaUsuario = listausuario;
		
		this.getBotonAñadir().addClickListener(event -> {

			_listaUsuario._usuario._iUsuario.anadir(this._listaUsuario._usuario.u.getID(), this.getTexto().getValue());
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).removeAll();
			
			//RECARGA
		    usuario nubd = _listaUsuario._usuario._iUsuario.obtenerUsuarioporId(_listaUsuario._usuario.u.getID());
			Usuario nu = new Usuario(_listaUsuario._usuario.MainView, nubd);
			_listaUsuario._usuario.MainView.removeAll();
			_listaUsuario._usuario.MainView.add(nu);
			//

		});


		this.getBotonCancelar().addClickListener(event -> {
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).removeAll();
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).add(_listaUsuario);
		});

	}
}