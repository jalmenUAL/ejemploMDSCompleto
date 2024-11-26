package interfaz;

import vistas.VistaLogin;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.administrador;
import basededatos.iCibernauta;
import basededatos.registrado;
import basededatos.usuario;

public class login extends VistaLogin {
	public Cibernauta _cibernauta;

	login(Cibernauta cibernauta) {

		_cibernauta = cibernauta;

		this.getBotonlogin().addClickListener(event -> {

			registrado r = this._cibernauta._iCibernauta.login(this.getLogin().getValue(),
					this.getPassword().getValue());

			this._cibernauta.MainView.removeAll();

			if (r instanceof usuario) {
				Usuario u = new Usuario(this._cibernauta.MainView, (basededatos.usuario) r);
				this._cibernauta.MainView.add(u);

			}

			else if (r instanceof administrador) {
				Administrador a = new Administrador(this._cibernauta.MainView);
				this._cibernauta.MainView.add(a);
			}

			else {
				Notification.show("Este usuario no existe");
			}
		});

		this.getCancelar().addClickListener(event -> {
			this._cibernauta.MainView.removeAll();
			this._cibernauta.MainView.add(this._cibernauta);
		});

	}

}