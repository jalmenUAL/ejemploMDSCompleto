package basededatos;

import interfaz.UsuarioRegistrado;
import interfaz.UsuarioGenerico;
import interfaz.Usuario;
import interfaz.Cibernauta;

import org.orm.PersistentException;

import interfaz.Administrador;

public class BDPrincipal implements iUsuarioRegistrado, iUsuario, iCibernauta, iAdministrador, iUsuarioGenerico {
	public usuarios _usuarios = new usuarios();
	public textos _textos = new textos();
	public administradores _administradores = new administradores();

	public void anadir(int aId, String aTexto) {
		throw new UnsupportedOperationException();
	}

	public void modificar(int aId, String aTexto) {
		throw new UnsupportedOperationException();
	}

	public registrado login(String aLogin, String aPassword) {
			registrado u = null;
			try {
				u = _usuarios.login(aLogin, aPassword);
				if (u==null) {u = _administradores.login(aLogin, aPassword);}
				
				 
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return u;
			
	}

	public void borrar(int aId) {
		throw new UnsupportedOperationException();
	}


	public texto[] cargar() {
		throw new UnsupportedOperationException();
	}

	public void actualizar(int aId, String aNombre, String aDNI, String aCorreo, String aNick, String aLogin, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void registrar(String aNombre, String aDNI, String aNick, String aCorreo, String aLogin, String aPassword) {
		try {
			_usuarios.registrar(aDNI, aNombre, aCorreo, aNick, aLogin, aPassword);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}