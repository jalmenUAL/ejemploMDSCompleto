/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: jalmen(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class usuarioDAO {
	public static usuario loadUsuarioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario getUsuarioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario loadUsuarioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario getUsuarioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario loadUsuarioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (usuario) session.load(basededatos.usuario.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario getUsuarioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (usuario) session.get(basededatos.usuario.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario loadUsuarioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (usuario) session.load(basededatos.usuario.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario getUsuarioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (usuario) session.get(basededatos.usuario.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.usuario as usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.usuario as usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (usuario[]) list.toArray(new usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (usuario[]) list.toArray(new usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.usuario as usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.usuario as usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario createUsuario() {
		return new basededatos.usuario();
	}
	
	public static boolean save(basededatos.usuario lusuario) throws PersistentException {
		try {
			Mds2PersistentManager.instance().saveObject(lusuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.usuario lusuario) throws PersistentException {
		try {
			Mds2PersistentManager.instance().deleteObject(lusuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.usuario lusuario)throws PersistentException {
		try {
			basededatos.texto[] lHa_escritos = lusuario.ha_escrito.toArray();
			for(int i = 0; i < lHa_escritos.length; i++) {
				lHa_escritos[i].setEscrito_por(null);
			}
			return delete(lusuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.usuario lusuario, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.texto[] lHa_escritos = lusuario.ha_escrito.toArray();
			for(int i = 0; i < lHa_escritos.length; i++) {
				lHa_escritos[i].setEscrito_por(null);
			}
			try {
				session.delete(lusuario);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.usuario lusuario) throws PersistentException {
		try {
			Mds2PersistentManager.instance().getSession().refresh(lusuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.usuario lusuario) throws PersistentException {
		try {
			Mds2PersistentManager.instance().getSession().evict(lusuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static usuario loadUsuarioByCriteria(usuarioCriteria usuarioCriteria) {
		usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static usuario[] listUsuarioByCriteria(usuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
