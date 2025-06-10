package interfaz;

import org.orm.PersistentException;

import basededatos.Mds2PersistentManager;
import mds2.MainView;

//import basededatos.iUsuarioRegistrado;

public class UsuarioRegistrado extends UsuarioGenerico {
	// private event _logout;
	// public iUsuarioRegistrado _iUsuarioRegistrado;
	

	UsuarioRegistrado(MainView MainView) {
		super(MainView);
		this.getLogin().setVisible(false);
		this.getRegistrarse().setVisible(false);

		this.getLogout().addClickListener(event -> logout());

	}

	public void logout() {
		MainView.removeAll();
		try {
			Mds2PersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cibernauta cb = new Cibernauta(this.MainView);
		MainView.add(cb);
	}
}