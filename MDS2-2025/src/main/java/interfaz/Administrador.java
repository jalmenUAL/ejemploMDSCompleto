package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.texto;

import mds2.MainView;
import basededatos.BDPrincipal;
import basededatos.administrador;
import basededatos.iAdministrador;

public class Administrador extends UsuarioRegistrado {
	public iAdministrador _iAdministrador = new BDPrincipal();
	public ListaAdministrador _listaAdministrador;

	Administrador(MainView MainView) {
		super(MainView);
		this.getModificarperfil().setVisible(false);
		ListaAdministrador();
	}

	public void ListaAdministrador() {
		ListaAdministrador l = new ListaAdministrador(this);
		this.getContenido().as(VerticalLayout.class).add(l);
	}
}