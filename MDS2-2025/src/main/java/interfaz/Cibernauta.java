package interfaz;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import mds2.MainView;



public class Cibernauta extends UsuarioGenerico {
	public iCibernauta _iCibernauta = new BDPrincipal();
	public login _login;
	public registrar _registrar;
	public MainView MainView;
	
	public Cibernauta(MainView MainView){this.MainView=MainView; this.getLogout().setVisible(false); this.getModificarperfil().setVisible(false);
	
	this.getLogin().addClickListener(event->login());
	
	this.getRegistrarse().addClickListener(event->registrar());
	}

	public void login() {
	     _login = new login(this);
	     MainView.removeAll();
	     MainView.add(_login);
	
	}

	public void registrar() {
		 _registrar = new registrar(this);
	     MainView.removeAll();
	     MainView.add(_registrar);
	}
}