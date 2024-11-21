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

public class registradoDAO {
	public static registrado loadRegistradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadRegistradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado getRegistradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return getRegistradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado loadRegistradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadRegistradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado getRegistradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return getRegistradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado loadRegistradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (registrado) session.load(basededatos.registrado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado getRegistradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (registrado) session.get(basededatos.registrado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado loadRegistradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (registrado) session.load(basededatos.registrado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado getRegistradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (registrado) session.get(basededatos.registrado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return queryRegistrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return queryRegistrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado[] listRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return listRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado[] listRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return listRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.registrado as registrado");
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
	
	public static List queryRegistrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.registrado as registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("registrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado[] listRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRegistrado(session, condition, orderBy);
			return (registrado[]) list.toArray(new registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado[] listRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRegistrado(session, condition, orderBy, lockMode);
			return (registrado[]) list.toArray(new registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado loadRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado loadRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado loadRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		registrado[] registrados = listRegistradoByQuery(session, condition, orderBy);
		if (registrados != null && registrados.length > 0)
			return registrados[0];
		else
			return null;
	}
	
	public static registrado loadRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		registrado[] registrados = listRegistradoByQuery(session, condition, orderBy, lockMode);
		if (registrados != null && registrados.length > 0)
			return registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return iterateRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return iterateRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.registrado as registrado");
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
	
	public static java.util.Iterator iterateRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.registrado as registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("registrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado createRegistrado() {
		return new basededatos.registrado();
	}
	
	public static boolean save(basededatos.registrado lregistrado) throws PersistentException {
		try {
			Mds2PersistentManager.instance().saveObject(lregistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.registrado lregistrado) throws PersistentException {
		try {
			Mds2PersistentManager.instance().deleteObject(lregistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.registrado lregistrado) throws PersistentException {
		try {
			Mds2PersistentManager.instance().getSession().refresh(lregistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.registrado lregistrado) throws PersistentException {
		try {
			Mds2PersistentManager.instance().getSession().evict(lregistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static registrado loadRegistradoByCriteria(registradoCriteria registradoCriteria) {
		registrado[] registrados = listRegistradoByCriteria(registradoCriteria);
		if(registrados == null || registrados.length == 0) {
			return null;
		}
		return registrados[0];
	}
	
	public static registrado[] listRegistradoByCriteria(registradoCriteria registradoCriteria) {
		return registradoCriteria.listRegistrado();
	}
}
