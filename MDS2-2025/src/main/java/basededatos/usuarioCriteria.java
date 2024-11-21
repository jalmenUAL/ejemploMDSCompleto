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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class usuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression DNI;
	public final StringExpression correo;
	public final StringExpression nick;
	public final StringExpression login;
	public final StringExpression password;
	public final CollectionExpression ha_escrito;
	
	public usuarioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		DNI = new StringExpression("DNI", this);
		correo = new StringExpression("correo", this);
		nick = new StringExpression("nick", this);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
		ha_escrito = new CollectionExpression("ORM_Ha_escrito", this);
	}
	
	public usuarioCriteria(PersistentSession session) {
		this(session.createCriteria(usuario.class));
	}
	
	public usuarioCriteria() throws PersistentException {
		this(Mds2PersistentManager.instance().getSession());
	}
	
	public textoCriteria createHa_escritoCriteria() {
		return new textoCriteria(createCriteria("ORM_Ha_escrito"));
	}
	
	public usuario uniqueUsuario() {
		return (usuario) super.uniqueResult();
	}
	
	public usuario[] listUsuario() {
		java.util.List list = super.list();
		return (usuario[]) list.toArray(new usuario[list.size()]);
	}
}

