package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.texto;

public class ListaUsuario_item extends Lista_item {
	ListaUsuario_item(ListaUsuario lista, texto texto) {
		super(lista, texto);
		this.getSeleccionar().setVisible(false);
		this.getModificar().setVisible(false);
		this.getModificar().addClickListener(event -> Modificar());

	}

	public Modificar _modificar;

	public void Modificar() {
		ListaUsuario lu = (ListaUsuario) this._lista;
		lu._usuario.getContenido().as(VerticalLayout.class).removeAll();
		Modificar m = new Modificar(this);
		lu._usuario.getContenido().as(VerticalLayout.class).add(m);

	}
}