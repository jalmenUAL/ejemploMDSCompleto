package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.usuario;

public class usuarios {
	public BDPrincipal _en;
	public Vector<usuario> _los_usuarios = new Vector<usuario>();

	public void registrar(String aDNI, String aNombre, String aCorreo, String aNick, String aLogin, String aPassword)
			throws PersistentException {

		PersistentTransaction t = Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			usuario u = usuarioDAO.createUsuario();
			u.setCorreo(aCorreo);
			u.setDNI(aDNI);
			u.setLogin(aLogin);
			u.setPassword(aPassword);
			u.setNick(aNick);
			u.setNombre(aNombre);
			usuarioDAO.save(u);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		Mds2PersistentManager.instance().disposePersistentManager();
	}

	public void actualizar(int aId, String aNombre, String aCorreo, String aNick, String aDNI, String aLogin,
			String aPassword) throws PersistentException {

		PersistentTransaction t = Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			usuario u = usuarioDAO.getUsuarioByORMID(aId);
			u.setCorreo(aCorreo);
			u.setDNI(aDNI);
			u.setLogin(aLogin);
			u.setPassword(aPassword);
			u.setNick(aNick);
			u.setNombre(aNombre);
			usuarioDAO.refresh(u);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		Mds2PersistentManager.instance().disposePersistentManager();

	}

	public usuario login(String aLogin, String aPassword) throws PersistentException {
		usuario usuario = null;
		PersistentTransaction t = Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			usuario = usuarioDAO.loadUsuarioByQuery("Login = '" + aLogin + "' AND Password = '" + aPassword + "'",
					null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		Mds2PersistentManager.instance().disposePersistentManager();
		return usuario;
	}
}