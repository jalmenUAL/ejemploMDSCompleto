package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-datosdeperfil")
@JsModule("./views/vista-datosdeperfil.ts")
public class VistaDatosdeperfil extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinFormLayout")
	private FormLayout vaadinFormLayout;
	@Id("nombre")
	private TextField nombre;
	@Id("nick")
	private TextField nick;
	@Id("correo")
	private TextField correo;
	@Id("dardealta")
	private Button dardealta;
	@Id("actualizar")
	private Button actualizar;
	@Id("cancelar")
	private Button cancelar;

	public VistaDatosdeperfil() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public FormLayout getVaadinFormLayout() {
		return vaadinFormLayout;
	}

	public void setVaadinFormLayout(FormLayout vaadinFormLayout) {
		this.vaadinFormLayout = vaadinFormLayout;
	}

	public TextField getNombre() {
		return nombre;
	}

	public void setNombre(TextField nombre) {
		this.nombre = nombre;
	}

	public TextField getNick() {
		return nick;
	}

	public void setNick(TextField nick) {
		this.nick = nick;
	}

	public TextField getCorreo() {
		return correo;
	}

	public void setCorreo(TextField correo) {
		this.correo = correo;
	}

	public Button getDardealta() {
		return dardealta;
	}

	public void setDardealta(Button dardealta) {
		this.dardealta = dardealta;
	}

	public Button getActualizar() {
		return actualizar;
	}

	public void setActualizar(Button actualizar) {
		this.actualizar = actualizar;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

	 

}