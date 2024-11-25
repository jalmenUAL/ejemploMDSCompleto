package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.texto;

import vistas.VistaLista_item;

public class Lista_item extends VistaLista_item {
	public Lista _lista;
	public Verdetalles _verdetalles;

	Lista_item(Lista lista,texto texto){
		_lista = lista;
		this.getBotonverdetalles().addClickListener(event->Verdetalles());
		
	}
	
	public void Verdetalles() {
		
		if (_lista instanceof ListaUsuario) {  ListaUsuario lu = (ListaUsuario) _lista;
												Verdetalles vd = new Verdetalles(this);
												lu._usuario.getContenido().as(VerticalLayout.class).removeAll();
												lu._usuario.getContenido().as(VerticalLayout.class).add(vd);
												}
		else {
			 ListaAdministrador lu = (ListaAdministrador) _lista;
				Verdetalles vd = new Verdetalles(this);
				lu._administrador.getContenido().as(VerticalLayout.class).removeAll();
				lu._administrador.getContenido().as(VerticalLayout.class).add(vd);
		}
		  
	}
}