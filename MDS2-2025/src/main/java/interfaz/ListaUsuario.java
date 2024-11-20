package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaUsuario extends Lista {
	public Usuario _usuario;
	public Aadir _aadir;
	
	ListaUsuario(Usuario usuario){_usuario = usuario; this.getBorrar().setVisible(false);
	
	ListaUsuario_item li = new ListaUsuario_item(this);
	this.getListadeitems().as(VerticalLayout.class).add(li);
	ListaUsuario_item li2 = new ListaUsuario_item(this);
	this.getListadeitems().as(VerticalLayout.class).add(li2);
	
	this.getBotonAnadir().addClickListener(event->Aadir());
	
	}
	
	 

	public void Aadir() {
		
		Aadir a = new Aadir(this);
		
		_usuario.getContenido().as(VerticalLayout.class).removeAll();
	    _usuario.getContenido().as(VerticalLayout.class).add(a);
		
		
		

	}
}