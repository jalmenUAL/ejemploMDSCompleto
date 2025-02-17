package basededatos;

public interface iCibernauta extends iUsuarioGenerico {

	public void registrar(String aDNI, String aNombre, String aCorreo, String aNick,  String aLogin, String aPassword);

	public registrado login(String aLogin, String aPassword);
}