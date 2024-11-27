package interfaz;

import mds2.MainView;
import vistas.VistaUsuariogenerico;

//import basededatos.iUsuarioGenerico;

public class UsuarioGenerico extends VistaUsuariogenerico {
	// public iUsuarioGenerico _iUsuarioGenerico;
	
	MainView MainView;

	UsuarioGenerico(MainView MainView) {
		this.MainView = MainView;
	}
}