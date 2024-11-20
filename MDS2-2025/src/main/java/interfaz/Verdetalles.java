package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerdetalles;

public class Verdetalles extends VistaVerdetalles {
	public Lista_item _lista;
	
	Verdetalles(Lista_item lista){_lista = lista;
	
	this.getVolver().addClickListener(event->{
		
		if (_lista instanceof ListaUsuario_item) {  
			
		ListaUsuario lu = (ListaUsuario) _lista._lista; 
		lu._usuario.getContenido().as(VerticalLayout.class).removeAll();
		lu._usuario.getContenido().as(VerticalLayout.class).add(lu);
		}
		else {	
			ListaAdministrador lu = (ListaAdministrador) _lista._lista; 
			lu._administrador.getContenido().as(VerticalLayout.class).removeAll();
			lu._administrador.getContenido().as(VerticalLayout.class).add(lu);
		}
		
	});
	
	}
}