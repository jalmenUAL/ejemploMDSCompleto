package basededatos;

public interface iUsuario extends iUsuarioRegistrado {

	public void anadir(int aId, String aTexto);

	public void modificar(int aId, String aTexto);

	public usuario actualizar(int aId, String aNombre, String aDNI, String aCorreo, String aNick, String aLogin, String aPassword);
	
	public usuario obtenerUsuarioporId(int aId);
}