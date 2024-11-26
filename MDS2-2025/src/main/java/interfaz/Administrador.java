package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import mds2.MainView;

public class Administrador extends UsuarioRegistrado {
	public iAdministrador _iAdministrador = new BDPrincipal();
	public ListaAdministrador _listaAdministrador;

	Administrador(MainView MainView) {
		super(MainView);
		this.getModificarperfil().setVisible(false);
		ListaAdministrador();
	}

	public void ListaAdministrador() {
		_listaAdministrador = new ListaAdministrador(this);
		this.getContenido().as(VerticalLayout.class).add(_listaAdministrador);
	}
}