package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaModificar;

public class Modificar extends VistaModificar {
	public ListaUsuario_item _listaUsuario;

	Modificar(ListaUsuario_item ListaUsuario_item) {
		_listaUsuario = ListaUsuario_item;

		this.getTexto().setValue(_listaUsuario.t.getContenido());

		this.getBotonModificar().addClickListener(event -> {

			ListaUsuario lu = (ListaUsuario) _listaUsuario._lista;
			lu._usuario.getContenido().as(VerticalLayout.class).removeAll();

			lu._usuario._iUsuario.modificar(_listaUsuario.t.getID(), this.getTexto().getValue());
			
			//RECARGA
			lu._usuario = new Usuario(lu._usuario.MainView, lu._usuario.u);
			lu._usuario.MainView.removeAll();
			lu._usuario.MainView.add(lu._usuario);
			//


		});

		this.getBotonCancelar().addClickListener(event -> {
			ListaUsuario lu = (ListaUsuario) _listaUsuario._lista;
			lu._usuario.getContenido().as(VerticalLayout.class).removeAll();
			lu._usuario.getContenido().as(VerticalLayout.class).add(lu);
		});

	}
}