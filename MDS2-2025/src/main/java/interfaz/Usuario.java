package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import mds2.MainView;
import basededatos.BDPrincipal;
import basededatos.iUsuario;

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
		ListaUsuario l = new ListaUsuario(this);
		this.getContenido().as(VerticalLayout.class).add(l);
	}

	public void ModificarPerfil() {

		this.MainView.removeAll();
		ModificarPerfil mp = new ModificarPerfil(this);
		this.MainView.add(mp);

	}
}