package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;

@Tag("vista-lista_item")
@JsModule("./views/vista-lista_item.ts")
public class VistaLista_item extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("nick")
	private Span nick;
	@Id("texto")
	private Span texto;
	@Id("seleccionar")
	private Button seleccionar;
	@Id("modificar")
	private Button modificar;
	@Id("botonverdetalles")
	private Button botonverdetalles;
	 

	public VistaLista_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Span getNick() {
		return nick;
	}

	public void setNick(Span nick) {
		this.nick = nick;
	}

	public Span getTexto() {
		return texto;
	}

	public void setTexto(Span texto) {
		this.texto = texto;
	}

	public Button getSeleccionar() {
		return seleccionar;
	}

	public void setSeleccionar(Button seleccionar) {
		this.seleccionar = seleccionar;
	}

	public Button getModificar() {
		return modificar;
	}

	public void setModificar(Button modificar) {
		this.modificar = modificar;
	}

	public Button getBotonverdetalles() {
		return botonverdetalles;
	}

	public void setBotonverdetalles(Button botonverdetalles) {
		this.botonverdetalles = botonverdetalles;
	}
 

}