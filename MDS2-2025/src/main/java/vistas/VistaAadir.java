package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-aadir")
@JsModule("./views/vista-aadir.ts")
public class VistaAadir extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("registrarse")
	private Button registrarse;
	@Id("login")
	private Button login;
	@Id("logout")
	private Button logout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("Texto")
	private TextField texto;
	@Id("BotonAñadir")
	private Button botonAñadir;

	public VistaAadir() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getRegistrarse() {
		return registrarse;
	}

	public void setRegistrarse(Button registrarse) {
		this.registrarse = registrarse;
	}

	public Button getLogin() {
		return login;
	}

	public void setLogin(Button login) {
		this.login = login;
	}

	public Button getLogout() {
		return logout;
	}

	public void setLogout(Button logout) {
		this.logout = logout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public TextField getTexto() {
		return texto;
	}

	public void setTexto(TextField texto) {
		this.texto = texto;
	}

	public Button getBotonAñadir() {
		return botonAñadir;
	}

	public void setBotonAñadir(Button botonAñadir) {
		this.botonAñadir = botonAñadir;
	}

}