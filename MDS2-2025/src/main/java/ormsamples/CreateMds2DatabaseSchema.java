/**
 * Licensee: jalmen(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMds2DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.Mds2PersistentManager.instance());
			basededatos.Mds2PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
