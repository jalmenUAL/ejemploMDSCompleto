package interfaz;

import basededatos.usuario;

public class ModificarPerfil extends DatosdePerfil {
	// private event _actualizar;
	public Usuario _usuario;

	ModificarPerfil(Usuario usuario) {
		 
		this._usuario = usuario;

		this.getNombre().setValue(_usuario.u.getNombre());
		this.getDni().setValue(_usuario.u.getDNI());
		this.getCorreo().setValue(_usuario.u.getCorreo());
		this.getLogin().setValue(_usuario.u.getLogin());
		this.getPassword().setValue(_usuario.u.getPassword());
		this.getNick().setValue(_usuario.u.getNick());

		this.getDardealta().setVisible(false);

		this.getActualizar().addClickListener(event -> Actualizar());

		this.getCancelar().addClickListener(event -> {
			this._usuario.MainView.removeAll();
			this._usuario.MainView.add(this._usuario);
		});

	}

	public void Actualizar() {

		usuario u = this._usuario._iUsuario.actualizar(_usuario.u.getID(), this.getNombre().getValue(),
				this.getDni().getValue(), this.getCorreo().getValue(), this.getNick().getValue(),
				this.getLogin().getValue(), this.getPassword().getValue());

		this._usuario = new Usuario(this._usuario.MainView, u);
		this._usuario.MainView.removeAll();
		this._usuario.MainView.add(this._usuario);
	}
}