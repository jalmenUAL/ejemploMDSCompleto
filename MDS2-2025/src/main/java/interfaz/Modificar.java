package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.usuario;
import vistas.VistaModificar;

public class Modificar extends VistaModificar {
	public ListaUsuario_item _listaUsuario;

	Modificar(ListaUsuario_item ListaUsuario_item) {
		_listaUsuario = ListaUsuario_item;

		this.getTexto().setValue(_listaUsuario.t.getContenido());

		this.getBotonModificar().addClickListener(event -> {

			ListaUsuario lu = (ListaUsuario) _listaUsuario._lista;
			lu._usuario._iUsuario.modificar(_listaUsuario.t.getID(), this.getTexto().getValue());
			
			//RECARGA
		    usuario nubd = lu._usuario._iUsuario.obtenerUsuarioporId(lu._usuario.u.getID());
			Usuario nu = new Usuario(lu._usuario.MainView, nubd);
			lu._usuario.MainView.removeAll();
			lu._usuario.MainView.add(nu);
			//


		});

		this.getBotonCancelar().addClickListener(event -> {
			ListaUsuario lu = (ListaUsuario) _listaUsuario._lista;
			lu._usuario.getContenido().as(VerticalLayout.class).removeAll();
			lu._usuario.getContenido().as(VerticalLayout.class).add(lu);
		});

	}
}