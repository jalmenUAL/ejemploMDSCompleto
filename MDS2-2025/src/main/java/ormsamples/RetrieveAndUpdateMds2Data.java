/**
 * Licensee: jalmen(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMds2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.registrado lbasededatosregistrado = basededatos.registradoDAO.loadRegistradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.registradoDAO.save(lbasededatosregistrado);
			basededatos.usuario lbasededatosusuario = basededatos.usuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.usuarioDAO.save(lbasededatosusuario);
			basededatos.texto lbasededatostexto = basededatos.textoDAO.loadTextoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.textoDAO.save(lbasededatostexto);
			basededatos.administrador lbasededatosadministrador = basededatos.administradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.administradorDAO.save(lbasededatosadministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving registrado by registradoCriteria");
		basededatos.registradoCriteria lbasededatosregistradoCriteria = new basededatos.registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosregistradoCriteria.ID.eq();
		System.out.println(lbasededatosregistradoCriteria.uniqueRegistrado());
		
		System.out.println("Retrieving usuario by usuarioCriteria");
		basededatos.usuarioCriteria lbasededatosusuarioCriteria = new basededatos.usuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosusuarioCriteria.ID.eq();
		System.out.println(lbasededatosusuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving texto by textoCriteria");
		basededatos.textoCriteria lbasededatostextoCriteria = new basededatos.textoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatostextoCriteria.ID.eq();
		System.out.println(lbasededatostextoCriteria.uniqueTexto());
		
		System.out.println("Retrieving administrador by administradorCriteria");
		basededatos.administradorCriteria lbasededatosadministradorCriteria = new basededatos.administradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosadministradorCriteria.ID.eq();
		System.out.println(lbasededatosadministradorCriteria.uniqueAdministrador());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMds2Data retrieveAndUpdateMds2Data = new RetrieveAndUpdateMds2Data();
			try {
				retrieveAndUpdateMds2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateMds2Data.retrieveByCriteria();
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
