package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class administradores {
	public BDPrincipal _en;
	public Vector<administrador> _los_administradores = new Vector<administrador>();

	public administrador login(String aLogin, String aPassword) throws PersistentException {

		administrador administrador = null;
		PersistentTransaction t = Mds2PersistentManager.instance().getSession().beginTransaction();

		try {
			administrador = administradorDAO
					.loadAdministradorByQuery("Login = '" + aLogin + "' AND Password = '" + aPassword + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return administrador;
	}
}
