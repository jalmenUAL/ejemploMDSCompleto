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
			
			// RECARGA DE LA LISTA CON EL ELEMENTO AÑADIDO
			_listaUsuario = new ListaUsuario(_listaUsuario._usuario);
			
			
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).add(_listaUsuario);
			 

		});

	}
}