/**
 * Licensee: jalmen(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;

import basededatos.administrador;
import basededatos.administradores;
import basededatos.registrado;
import basededatos.usuario;
import basededatos.usuarios;
import basededatos.BDPrincipal;
import basededatos.iCibernauta;
public class ListMds2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing registrado...");
		basededatos.registrado[] basededatosregistrados = basededatos.registradoDAO.listRegistradoByQuery(null, null);
		int length = Math.min(basededatosregistrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosregistrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing usuario...");
		basededatos.usuario[] basededatosusuarios = basededatos.usuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(basededatosusuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosusuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing texto...");
		basededatos.texto[] basededatostextos = basededatos.textoDAO.listTextoByQuery(null, null);
		length = Math.min(basededatostextos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatostextos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing administrador...");
		basededatos.administrador[] basededatosadministradors = basededatos.administradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(basededatosadministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosadministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing registrado by Criteria...");
		basededatos.registradoCriteria lbasededatosregistradoCriteria = new basededatos.registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosregistradoCriteria.ID.eq();
		lbasededatosregistradoCriteria.setMaxResults(ROW_COUNT);
		basededatos.registrado[] basededatosregistrados = lbasededatosregistradoCriteria.listRegistrado();
		int length =basededatosregistrados== null ? 0 : Math.min(basededatosregistrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosregistrados[i]);
		}
		System.out.println(length + " registrado record(s) retrieved."); 
		
		System.out.println("Listing usuario by Criteria...");
		basededatos.usuarioCriteria lbasededatosusuarioCriteria = new basededatos.usuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosusuarioCriteria.ID.eq();
		lbasededatosusuarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.usuario[] basededatosusuarios = lbasededatosusuarioCriteria.listUsuario();
		length =basededatosusuarios== null ? 0 : Math.min(basededatosusuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosusuarios[i]);
		}
		System.out.println(length + " usuario record(s) retrieved."); 
		
		System.out.println("Listing texto by Criteria...");
		basededatos.textoCriteria lbasededatostextoCriteria = new basededatos.textoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatostextoCriteria.ID.eq();
		lbasededatostextoCriteria.setMaxResults(ROW_COUNT);
		basededatos.texto[] basededatostextos = lbasededatostextoCriteria.listTexto();
		length =basededatostextos== null ? 0 : Math.min(basededatostextos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatostextos[i]);
		}
		System.out.println(length + " texto record(s) retrieved."); 
		
		System.out.println("Listing administrador by Criteria...");
		basededatos.administradorCriteria lbasededatosadministradorCriteria = new basededatos.administradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosadministradorCriteria.ID.eq();
		lbasededatosadministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.administrador[] basededatosadministradors = lbasededatosadministradorCriteria.listAdministrador();
		length =basededatosadministradors== null ? 0 : Math.min(basededatosadministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosadministradors[i]);
		}
		System.out.println(length + " administrador record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		/*
		try {
			ListMds2Data listMds2Data = new ListMds2Data();
			try {
				listMds2Data.listTestData();
				//listMds2Data.listByCriteria();
			}
			finally {
				basededatos.Mds2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		/*
		String aLogin ="admin";
		String aPassword = "admin";
		administradores _administradores = new administradores();
		usuarios _usuarios = new usuarios();
		registrado u;
		try {
			u = (registrado) _usuarios.login(aLogin, aPassword);
			if (u==null) {u = (registrado) _administradores.login(aLogin, aPassword);}
			System.out.println(u.getID());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		iCibernauta ic = new BDPrincipal();
		registrado r =ic.login("u", "u");
		System.out.println(r.getID());
	}
}
