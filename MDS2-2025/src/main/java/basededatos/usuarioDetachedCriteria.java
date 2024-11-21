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

public class usuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression DNI;
	public final StringExpression correo;
	public final StringExpression nick;
	public final StringExpression login;
	public final StringExpression password;
	public final CollectionExpression ha_escrito;
	
	public usuarioDetachedCriteria() {
		super(basededatos.usuario.class, basededatos.usuarioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		DNI = new StringExpression("DNI", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		ha_escrito = new CollectionExpression("ORM_Ha_escrito", this.getDetachedCriteria());
	}
	
	public usuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.usuarioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		DNI = new StringExpression("DNI", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		ha_escrito = new CollectionExpression("ORM_Ha_escrito", this.getDetachedCriteria());
	}
	
	public textoDetachedCriteria createHa_escritoCriteria() {
		return new textoDetachedCriteria(createCriteria("ORM_Ha_escrito"));
	}
	
	public usuario uniqueUsuario(PersistentSession session) {
		return (usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (usuario[]) list.toArray(new usuario[list.size()]);
	}
}

