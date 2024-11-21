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

public class texto {
	public texto() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TEXTO_ESCRITO_POR) {
			this.escrito_por = (basededatos.usuario) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private basededatos.usuario escrito_por;
	
	private String contenido;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setContenido(String value) {
		this.contenido = value;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setEscrito_por(basededatos.usuario value) {
		if (escrito_por != null) {
			escrito_por.ha_escrito.remove(this);
		}
		if (value != null) {
			value.ha_escrito.add(this);
		}
	}
	
	public basededatos.usuario getEscrito_por() {
		return escrito_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Escrito_por(basededatos.usuario value) {
		this.escrito_por = value;
	}
	
	private basededatos.usuario getORM_Escrito_por() {
		return escrito_por;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
