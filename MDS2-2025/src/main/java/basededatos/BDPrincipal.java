package basededatos;

import org.orm.PersistentException;

public class BDPrincipal implements iUsuarioRegistrado, iUsuario, iCibernauta, iAdministrador, iUsuarioGenerico {
	public usuarios _usuarios = new usuarios();
	public textos _textos = new textos();
	public administradores _administradores = new administradores();

	public void anadir(int aId, String aTexto) {
		try {
			_textos.anadir(aId, aTexto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modificar(int aId, String aTexto) {
		try {
			_textos.modificar(aId, aTexto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public registrado login(String aLogin, String aPassword) {
		registrado u = null;
		try {
			u = (registrado) _usuarios.login(aLogin, aPassword);
			if (u == null) {
				u = (registrado) _administradores.login(aLogin, aPassword);
			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;

	}

	public void borrar(int aId) {
		try {
			_textos.borrar(aId);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public texto[] cargar() {
		texto[] res = null;
		try {
			res = _textos.cargar();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	public usuario actualizar(int aId, String aNombre, String aDNI, String aCorreo, String aNick, String aLogin,
			String aPassword) {
		usuario usuario = null;
		try {
			usuario = _usuarios.actualizar(aId, aNombre, aCorreo, aNick, aDNI, aLogin, aPassword);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;
	}

	public void registrar(String aNombre, String aDNI, String aNick, String aCorreo, String aLogin, String aPassword) {
		try {
			_usuarios.registrar(aDNI, aNombre, aCorreo, aNick, aLogin, aPassword);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public usuario obtenerUsuarioporId(int aId) {
		usuario usuario=null;
		try {
			usuario = _usuarios.obtenerUsuarioporId(aId);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;
	}
}