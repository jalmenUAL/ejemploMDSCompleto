package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAadir;

public class Aadir extends VistaAadir {
	public ListaUsuario _listaUsuario;

	Aadir(ListaUsuario listausuario) {
		_listaUsuario = listausuario;
		
		this.getBotonAñadir().addClickListener(event -> {

			_listaUsuario._usuario._iUsuario.anadir(this._listaUsuario._usuario.u.getID(), this.getTexto().getValue());
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).removeAll();
			
			//RECARGA
			_listaUsuario._usuario = new Usuario(_listaUsuario._usuario.MainView, _listaUsuario._usuario.u);
			_listaUsuario._usuario.MainView.removeAll();
			_listaUsuario._usuario.MainView.add(_listaUsuario._usuario);
			//

		});


		this.getBotonCancelar().addClickListener(event -> {
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).removeAll();
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).add(_listaUsuario);
		});

	}
}