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

public class textoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression escrito_porId;
	public final AssociationExpression escrito_por;
	public final StringExpression contenido;
	
	public textoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		escrito_porId = new IntegerExpression("escrito_por.", this);
		escrito_por = new AssociationExpression("escrito_por", this);
		contenido = new StringExpression("contenido", this);
	}
	
	public textoCriteria(PersistentSession session) {
		this(session.createCriteria(texto.class));
	}
	
	public textoCriteria() throws PersistentException {
		this(Mds2PersistentManager.instance().getSession());
	}
	
	public usuarioCriteria createEscrito_porCriteria() {
		return new usuarioCriteria(createCriteria("escrito_por"));
	}
	
	public texto uniqueTexto() {
		return (texto) super.uniqueResult();
	}
	
	public texto[] listTexto() {
		java.util.List list = super.list();
		return (texto[]) list.toArray(new texto[list.size()]);
	}
}

