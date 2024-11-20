package interfaz;

import vistas.VistaLogin;

public class login extends VistaLogin {
	public Cibernauta _cibernauta;
	
	login(Cibernauta cibernauta){
		
		_cibernauta = cibernauta; 
		
		this.getBotonlogin().addClickListener(
				event->
				{
				this._cibernauta.MainView.removeAll();
				
				if (this.getLogin().getValue().equals("u")) {
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