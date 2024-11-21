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

public class administradorDAO {
	public static administrador loadAdministradorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador getAdministradorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return getAdministradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador loadAdministradorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador getAdministradorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return getAdministradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador loadAdministradorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (administrador) session.load(basededatos.administrador.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador getAdministradorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (administrador) session.get(basededatos.administrador.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador loadAdministradorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (administrador) session.load(basededatos.administrador.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador getAdministradorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (administrador) session.get(basededatos.administrador.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador[] listAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador[] listAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.administrador as administrador");
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
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.administrador as administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("administrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy);
			return (administrador[]) list.toArray(new administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy, lockMode);
			return (administrador[]) list.toArray(new administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador loadAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador loadAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		administrador[] administradors = listAdministradorByQuery(session, condition, orderBy);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		administrador[] administradors = listAdministradorByQuery(session, condition, orderBy, lockMode);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.administrador as administrador");
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
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.administrador as administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("administrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador createAdministrador() {
		return new basededatos.administrador();
	}
	
	public static boolean save(basededatos.administrador ladministrador) throws PersistentException {
		try {
			Mds2PersistentManager.instance().saveObject(ladministrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.administrador ladministrador) throws PersistentException {
		try {
			Mds2PersistentManager.instance().deleteObject(ladministrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.administrador ladministrador) throws PersistentException {
		try {
			Mds2PersistentManager.instance().getSession().refresh(ladministrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.administrador ladministrador) throws PersistentException {
		try {
			Mds2PersistentManager.instance().getSession().evict(ladministrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static administrador loadAdministradorByCriteria(administradorCriteria administradorCriteria) {
		administrador[] administradors = listAdministradorByCriteria(administradorCriteria);
		if(administradors == null || administradors.length == 0) {
			return null;
		}
		return administradors[0];
	}
	
	public static administrador[] listAdministradorByCriteria(administradorCriteria administradorCriteria) {
		return administradorCriteria.listAdministrador();
	}
}
