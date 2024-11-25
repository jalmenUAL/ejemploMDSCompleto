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
	
	
	Administrador(MainView MainView, administrador administrador){super(MainView); this.getModificarperfil().setVisible(false);
	texto[] texto = null;
	ListaAdministrador(texto);
	
	}

	public void ListaAdministrador(texto[] texto) {
		ListaAdministrador l = new ListaAdministrador(this,texto);
		
		this.getContenido().as(VerticalLayout.class).add(l);
	}
}