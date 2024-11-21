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

public class textoDAO {
	public static texto loadTextoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadTextoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto getTextoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return getTextoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto loadTextoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadTextoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto getTextoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return getTextoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto loadTextoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (texto) session.load(basededatos.texto.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto getTextoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (texto) session.get(basededatos.texto.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto loadTextoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (texto) session.load(basededatos.texto.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto getTextoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (texto) session.get(basededatos.texto.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTexto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return queryTexto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTexto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return queryTexto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto[] listTextoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return listTextoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto[] listTextoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return listTextoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTexto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.texto as texto");
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
	
	public static List queryTexto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.texto as texto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("texto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto[] listTextoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTexto(session, condition, orderBy);
			return (texto[]) list.toArray(new texto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto[] listTextoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTexto(session, condition, orderBy, lockMode);
			return (texto[]) list.toArray(new texto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto loadTextoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadTextoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto loadTextoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return loadTextoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto loadTextoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		texto[] textos = listTextoByQuery(session, condition, orderBy);
		if (textos != null && textos.length > 0)
			return textos[0];
		else
			return null;
	}
	
	public static texto loadTextoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		texto[] textos = listTextoByQuery(session, condition, orderBy, lockMode);
		if (textos != null && textos.length > 0)
			return textos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTextoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return iterateTextoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTextoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Mds2PersistentManager.instance().getSession();
			return iterateTextoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTextoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.texto as texto");
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
	
	public static java.util.Iterator iterateTextoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.texto as texto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("texto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto createTexto() {
		return new basededatos.texto();
	}
	
	public static boolean save(basededatos.texto ltexto) throws PersistentException {
		try {
			Mds2PersistentManager.instance().saveObject(ltexto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.texto ltexto) throws PersistentException {
		try {
			Mds2PersistentManager.instance().deleteObject(ltexto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.texto ltexto)throws PersistentException {
		try {
			if (ltexto.getEscrito_por() != null) {
				ltexto.getEscrito_por().ha_escrito.remove(ltexto);
			}
			
			return delete(ltexto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.texto ltexto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (ltexto.getEscrito_por() != null) {
				ltexto.getEscrito_por().ha_escrito.remove(ltexto);
			}
			
			try {
				session.delete(ltexto);
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
	
	public static boolean refresh(basededatos.texto ltexto) throws PersistentException {
		try {
			Mds2PersistentManager.instance().getSession().refresh(ltexto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.texto ltexto) throws PersistentException {
		try {
			Mds2PersistentManager.instance().getSession().evict(ltexto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static texto loadTextoByCriteria(textoCriteria textoCriteria) {
		texto[] textos = listTextoByCriteria(textoCriteria);
		if(textos == null || textos.length == 0) {
			return null;
		}
		return textos[0];
	}
	
	public static texto[] listTextoByCriteria(textoCriteria textoCriteria) {
		return textoCriteria.listTexto();
	}
}
