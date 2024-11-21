package interfaz;

import vistas.VistaLogin;
import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import basededatos.registrado;
import basededatos.usuario;


public class login extends VistaLogin {
	public Cibernauta _cibernauta;
	public iCibernauta ic = new BDPrincipal();
	
	login(Cibernauta cibernauta){
		
		_cibernauta = cibernauta; 
		
		this.getBotonlogin().addClickListener(
				event->
				{
					
				registrado r = ic.login(this.getLogin().getValue(), this.getPassword().getValue());
					
				this._cibernauta.MainView.removeAll();
				
				if (r instanceof usuario) {
				Usuario u = new Usuario(this._cibernauta.MainView);
				this._cibernauta.MainView.add(u);
				}
				
				else {Administrador a = new Administrador(this._cibernauta.MainView);
				this._cibernauta.MainView.add(a);}
				}
				
				);
		
		this.getCancelar().addClickListener(
				event->
				{
				this._cibernauta.MainView.removeAll();
				this._cibernauta.MainView.add(this._cibernauta);
				}
				);
	
	}
	
	
}