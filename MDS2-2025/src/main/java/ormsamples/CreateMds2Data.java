/**
 * Licensee: jalmen(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMds2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.Mds2PersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.registrado lbasededatosregistrado = basededatos.registradoDAO.createRegistrado();
			// Initialize the properties of the persistent object here
			basededatos.registradoDAO.save(lbasededatosregistrado);
			basededatos.usuario lbasededatosusuario = basededatos.usuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ha_escrito
			basededatos.usuarioDAO.save(lbasededatosusuario);
			basededatos.texto lbasededatostexto = basededatos.textoDAO.createTexto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : escrito_por
			basededatos.textoDAO.save(lbasededatostexto);
			basededatos.administrador lbasededatosadministrador = basededatos.administradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatos.administradorDAO.save(lbasededatosadministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMds2Data createMds2Data = new CreateMds2Data();
			try {
				createMds2Data.createTestData();
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
