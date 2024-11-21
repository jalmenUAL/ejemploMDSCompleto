package basededatos;

import java.util.Vector;
import basededatos.usuario;

public class usuarios {
	public BDPrincipal _en;
	public Vector<usuario> _los_usuarios = new Vector<usuario>();

	public void registrar(String aDNI, String aNombre, String aCorreo, String aNick, String aLogin, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void actualizar(int aId, String aNombre, String aCorreo, String aNick, String aDNI, String aLogin, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public usuario login(String aLogin, String aPassword) {
		throw new UnsupportedOperationException();
	}
}