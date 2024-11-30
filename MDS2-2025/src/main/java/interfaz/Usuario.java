package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario;
import mds2.MainView;

public class Usuario extends UsuarioRegistrado {
	//
	public iUsuario _iUsuario = new BDPrincipal();
	public ListaUsuario _listaUsuario;
	public ModificarPerfil _modificarPerfil;
	public basededatos.usuario u;

	Usuario(MainView MainView, basededatos.usuario u) {
		super(MainView);
		this.u = u;
		this.getModificarperfil().addClickListener(event -> ModificarPerfil());
		ListaUsuario();
		
	}

	public void ListaUsuario() {
		_listaUsuario = new ListaUsuario(this);
		this.getContenido().as(VerticalLayout.class).add(_listaUsuario);
	}

	public void ModificarPerfil() {

		this.MainView.removeAll();
		_modificarPerfil = new ModificarPerfil(this);
		this.MainView.add(_modificarPerfil);

	}
}