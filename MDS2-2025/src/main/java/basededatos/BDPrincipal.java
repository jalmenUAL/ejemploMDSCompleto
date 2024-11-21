package basededatos;

import interfaz.UsuarioRegistrado;
import interfaz.UsuarioGenerico;
import interfaz.Usuario;
import interfaz.Cibernauta;
import interfaz.Administrador;

public class BDPrincipal implements iUsuarioRegistrado, iUsuario, iCibernauta, iAdministrador, iUsuarioGenerico {
	public usuarios _usuarios;
	public textos _textos;
	public administradores _administradores;

	public void anadir(int aId, String aTexto) {
		throw new UnsupportedOperationException();
	}

	public void modificar(int aId, String aTexto) {
		throw new UnsupportedOperationException();
	}

	public registrado login(String aLogin, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void borrar(int aId) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado get_UsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}

	public UsuarioGenerico get_UsuarioGenerico() {
		throw new UnsupportedOperationException();
	}

	public Usuario get_Usuario() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta get_Cibernauta() {
		throw new UnsupportedOperationException();
	}

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public texto[] cargar() {
		throw new UnsupportedOperationException();
	}

	public void actualizar(int aId, String aNombre, String aDNI, String aCorreo, String aNick, String aLogin, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void registrar(String aNombre, String aDNI, String aNick, String aCorreo, String aLogin, String aPassword) {
		throw new UnsupportedOperationException();
	}
}