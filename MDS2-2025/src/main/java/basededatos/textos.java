package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class textos {
	public BDPrincipal _en;
	public Vector<texto> _los_textos = new Vector<texto>();

	public void anadir(int aId, String aTexto) throws PersistentException {
		PersistentTransaction t = Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			texto e = textoDAO.createTexto();
			usuario u = usuarioDAO.getUsuarioByORMID(aId);
			e.setContenido(aTexto);
			e.setEscrito_por(u);
			textoDAO.save(e);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		Mds2PersistentManager.instance().disposePersistentManager();
	}

	public void modificar(int aId, String aTexto) throws PersistentException {
		PersistentTransaction t = Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			texto e = textoDAO.getTextoByORMID(aId);
			e.setContenido(aTexto);
			textoDAO.save(e);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		Mds2PersistentManager.instance().disposePersistentManager();
	}

	public void borrar(int aId) throws PersistentException {
		PersistentTransaction t = Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			texto e = textoDAO.getTextoByORMID(aId);
			textoDAO.delete(e);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		Mds2PersistentManager.instance().disposePersistentManager();
	}

	public texto[] cargar() throws PersistentException {
		texto[] res = null;
		PersistentTransaction t = Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			res = textoDAO.listTextoByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return res;
	}
}