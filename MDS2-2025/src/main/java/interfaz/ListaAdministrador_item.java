package interfaz;

public class ListaAdministrador_item extends Lista_item {
	//private event _seleccionar;
	
	

	ListaAdministrador_item(ListaAdministrador lista) {
		super(lista);
		this.getModificar().setVisible(false);
		
		this.getSeleccionar().addClickListener(event->Seleccionar());
		
		// TODO Auto-generated constructor stub
	}
	
	 

	public void Seleccionar() {
		
		this.getStyle().set("color", "red");
		ListaAdministrador la = (ListaAdministrador) _lista;
		la._item.add(this);
		
		
		
	}
}