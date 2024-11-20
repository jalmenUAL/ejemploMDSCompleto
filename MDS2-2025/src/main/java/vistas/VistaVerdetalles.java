package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;

@Tag("vista-verdetalles")
@JsModule("./views/vista-verdetalles.ts")
public class VistaVerdetalles extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nick")
	private Span nick;
	@Id("correo")
	private Span correo;
	@Id("texto")
	private Span texto;
	@Id("volver")
	private Button volver;

	public VistaVerdetalles() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Span getNick() {
		return nick;
	}

	public void setNick(Span nick) {
		this.nick = nick;
	}

	public Span getCorreo() {
		return correo;
	}

	public void setCorreo(Span correo) {
		this.correo = correo;
	}

	public Span getTexto() {
		return texto;
	}

	public void setTexto(Span texto) {
		this.texto = texto;
	}

	public Button getVolver() {
		return volver;
	}

	public void setVolver(Button volver) {
		this.volver = volver;
	}

}