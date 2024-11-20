package interfaz;

public class ListaUsuario_item extends Lista_item {
	ListaUsuario_item(ListaUsuario lista) {
		super(lista);
		this.getSeleccionar().setVisible(false);
		// TODO Auto-generated constructor stub
	}

	public Modificar _modificar;

	public void Modificar() {
		throw new UnsupportedOperationException();
	}
}