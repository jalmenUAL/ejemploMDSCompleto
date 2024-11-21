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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class administradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression DNI;
	public final StringExpression correo;
	public final StringExpression nick;
	public final StringExpression login;
	public final StringExpression password;
	
	public administradorDetachedCriteria() {
		super(basededatos.administrador.class, basededatos.administradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		DNI = new StringExpression("DNI", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public administradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.administradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		DNI = new StringExpression("DNI", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public administrador uniqueAdministrador(PersistentSession session) {
		return (administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (administrador[]) list.toArray(new administrador[list.size()]);
	}
}

