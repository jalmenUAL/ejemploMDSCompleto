package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.texto;

public class ListaUsuario extends Lista {
	public Usuario _usuario;
	public Aadir _aadir;

	ListaUsuario(Usuario usuario) {

		super();
		_usuario = usuario;

		texto[] elementos = this._usuario._iUsuario.cargar();

		for (int i = 0; i < elementos.length; i++) {
			ListaUsuario_item l = new ListaUsuario_item(this, elementos[i]);
			if (_usuario.u.ha_escrito.contains(elementos[i])) {
				l.getModificar().setVisible(true);
			}
			this.getListadeitems().as(VerticalLayout.class).add(l);
		}

		this.getBorrar().setVisible(false);
		this.getBotonAnadir().addClickListener(event -> Aadir());

	}

	public void Aadir() {

		Aadir a = new Aadir(this);
		_usuario.getContenido().as(VerticalLayout.class).removeAll();
		_usuario.getContenido().as(VerticalLayout.class).add(a);

	}
}