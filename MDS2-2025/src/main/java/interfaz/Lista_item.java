package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.texto;
import vistas.VistaLista_item;

public class Lista_item extends VistaLista_item {
	public Lista _lista;
	public Verdetalles _verdetalles;
	public texto t;

	Lista_item(Lista lista, texto texto) {
		_lista = lista;
		t = texto;
		this.getNick().setText(texto.getEscrito_por().getNick());
		this.getTexto().setText(texto.getContenido());
		this.getBotonverdetalles().addClickListener(event -> Verdetalles());

	}

	public void Verdetalles() {

		if (_lista instanceof ListaUsuario) {
			ListaUsuario lu = (ListaUsuario) _lista;
			_verdetalles = new Verdetalles(this, t);
			lu._usuario.getContenido().as(VerticalLayout.class).removeAll();
			lu._usuario.getContenido().as(VerticalLayout.class).add(_verdetalles);
		} else {
			ListaAdministrador lu = (ListaAdministrador) _lista;
			_verdetalles = new Verdetalles(this, t);
			lu._administrador.getContenido().as(VerticalLayout.class).removeAll();
			lu._administrador.getContenido().as(VerticalLayout.class).add(_verdetalles);
		}

	}
}