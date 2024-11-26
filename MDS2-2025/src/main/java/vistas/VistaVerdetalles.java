package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

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
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("label1")
	private Label label1;
	@Id("label2")
	private Label label2;

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