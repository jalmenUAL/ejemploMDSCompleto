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

public class usuario extends basededatos.registrado {
	public usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_HA_ESCRITO) {
			return ORM_ha_escrito;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_ha_escrito = new java.util.HashSet();
	
	private void setORM_Ha_escrito(java.util.Set value) {
		this.ORM_ha_escrito = value;
	}
	
	private java.util.Set getORM_Ha_escrito() {
		return ORM_ha_escrito;
	}
	
	public final basededatos.textoSetCollection ha_escrito = new basededatos.textoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_HA_ESCRITO, ORMConstants.KEY_TEXTO_ESCRITO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
