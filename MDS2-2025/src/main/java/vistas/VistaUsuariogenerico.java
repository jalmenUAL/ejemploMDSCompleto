package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-usuariogenerico")
@JsModule("./views/vista-usuariogenerico.ts")
public class VistaUsuariogenerico extends LitTemplate {

    @Id("Registrarse")
	private Button registrarse;
	@Id("Login")
	private Button login;
	@Id("Logout")
	private Button logout;
	@Id("layoutprincipal")
	private Element layoutprincipal;
	@Id("barrademenu")
	private HorizontalLayout barrademenu;
	@Id("modificarperfil")
	private Button modificarperfil;
	@Id("contenido")
	private Element contenido;

	public VistaUsuariogenerico() {
        // You can initialise any data required for the connected UI components here.
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

	public Element getLayoutprincipal() {
		return layoutprincipal;
	}

	public void setLayoutprincipal(Element layoutprincipal) {
		this.layoutprincipal = layoutprincipal;
	}

	public HorizontalLayout getBarrademenu() {
		return barrademenu;
	}

	public void setBarrademenu(HorizontalLayout barrademenu) {
		this.barrademenu = barrademenu;
	}

	public Button getModificarperfil() {
		return modificarperfil;
	}

	public void setModificarperfil(Button modificarperfil) {
		this.modificarperfil = modificarperfil;
	}

	public Element getContenido() {
		return contenido;
	}

	public void setContenido(Element contenido) {
		this.contenido = contenido;
	}

}