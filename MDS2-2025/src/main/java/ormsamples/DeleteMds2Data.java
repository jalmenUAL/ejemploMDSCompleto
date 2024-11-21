/**
 * Licensee: jalmen(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMds2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.registrado lbasededatosregistrado = basededatos.registradoDAO.loadRegistradoByQuery(null, null);
			// Delete the persistent object
			basededatos.registradoDAO.delete(lbasededatosregistrado);
			basededatos.usuario lbasededatosusuario = basededatos.usuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatos.usuarioDAO.delete(lbasededatosusuario);
			basededatos.texto lbasededatostexto = basededatos.textoDAO.loadTextoByQuery(null, null);
			// Delete the persistent object
			basededatos.textoDAO.delete(lbasededatostexto);
			basededatos.administrador lbasededatosadministrador = basededatos.administradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.administradorDAO.delete(lbasededatosadministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMds2Data deleteMds2Data = new DeleteMds2Data();
			try {
				deleteMds2Data.deleteTestData();
			}
			finally {
				basededatos.Mds2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
