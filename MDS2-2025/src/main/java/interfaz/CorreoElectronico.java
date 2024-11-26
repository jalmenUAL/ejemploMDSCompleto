package interfaz;

import com.vaadin.flow.component.notification.Notification;

public class CorreoElectronico {
	public registrar _registrar;

	public void Mandarconfirmacin() {
		Notification.show("El correo con el registro ha sido enviado");
	}
}