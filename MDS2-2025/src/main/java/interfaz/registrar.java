package interfaz;

public class registrar extends DatosdePerfil {
	// private event _dardealta;
	public Cibernauta _cibernauta;
	public CorreoElectronico _correoElectronico;

	registrar(Cibernauta cibernauta) {
		 
		_cibernauta = cibernauta;
		this.getActualizar().setVisible(false);
		this.getDardealta().addClickListener(event -> Dardealta());
		this.getCancelar().addClickListener(event -> {
			this._cibernauta.MainView.removeAll();
			this._cibernauta.MainView.add(this._cibernauta);
		});

	}

	public void Mandarconfirmacin() {
		_correoElectronico = new CorreoElectronico();
		_correoElectronico.Mandarconfirmacin();
	}

	public void Dardealta() {

		this._cibernauta._iCibernauta.registrar(this.getNombre().getValue(), this.getDni().getValue(),
				this.getNick().getValue(), this.getCorreo().getValue(), this.getLogin().getValue(),
				this.getPassword().getValue());

		this._cibernauta.MainView.removeAll();
		this._cibernauta.MainView.add(this._cibernauta);
	}
}