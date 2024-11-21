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

public class textoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression escrito_porId;
	public final AssociationExpression escrito_por;
	public final StringExpression contenido;
	
	public textoDetachedCriteria() {
		super(basededatos.texto.class, basededatos.textoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		escrito_porId = new IntegerExpression("escrito_por.", this.getDetachedCriteria());
		escrito_por = new AssociationExpression("escrito_por", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
	}
	
	public textoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.textoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		escrito_porId = new IntegerExpression("escrito_por.", this.getDetachedCriteria());
		escrito_por = new AssociationExpression("escrito_por", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
	}
	
	public usuarioDetachedCriteria createEscrito_porCriteria() {
		return new usuarioDetachedCriteria(createCriteria("escrito_por"));
	}
	
	public texto uniqueTexto(PersistentSession session) {
		return (texto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public texto[] listTexto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (texto[]) list.toArray(new texto[list.size()]);
	}
}

