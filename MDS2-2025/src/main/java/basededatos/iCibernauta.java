package basededatos;

public interface iCibernauta extends iUsuarioGenerico {

	public void registrar(String aNombre, String aDNI, String aNick, String aCorreo, String aLogin, String aPassword);

	public registrado login(String aLogin, String aPassword);
}