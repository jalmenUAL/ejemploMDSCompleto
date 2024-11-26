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

			// RECARGA DE LA LISTA MODIFICADA
			lu = new ListaUsuario(lu._usuario);

			lu._usuario.getContenido().as(VerticalLayout.class).add(lu);

		});

		this.getBotonCancelar().addClickListener(event -> {
			ListaUsuario lu = (ListaUsuario) _listaUsuario._lista;
			lu._usuario.getContenido().as(VerticalLayout.class).removeAll();
			lu._usuario.getContenido().as(VerticalLayout.class).add(lu);
		});

	}
}