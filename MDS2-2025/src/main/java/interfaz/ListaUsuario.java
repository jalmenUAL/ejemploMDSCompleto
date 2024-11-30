package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.texto;

public class ListaUsuario extends Lista {
	public Usuario _usuario;
	public Aadir _aadir;

	ListaUsuario(Usuario usuario) {

		_usuario = usuario;

		texto[] elementos = this._usuario._iUsuario.cargar();

		for (int i = 0; i < elementos.length; i++) {
			ListaUsuario_item l = new ListaUsuario_item(this, elementos[i]);

			int id = elementos[i].getEscrito_por().getID();

			if (_usuario.u.getID() == id) {
				l.getModificar().setVisible(true);
			}

			this.getListadeitems().as(VerticalLayout.class).add(l);

		}
		
		this.getBotonAnadir().addClickListener(event->Aadir());
		

		this.getBorrar().setVisible(false);
		

	}

	public void Aadir() {

		_aadir = new Aadir(this);
		_usuario.getContenido().as(VerticalLayout.class).removeAll();
		_usuario.getContenido().as(VerticalLayout.class).add(_aadir);

	}
}