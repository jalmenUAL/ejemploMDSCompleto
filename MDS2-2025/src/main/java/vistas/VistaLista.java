package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-lista")
@JsModule("./views/vista-lista.ts")
public class VistaLista extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("borrar")
	private Button borrar;
	@Id("listadeitems")
	private Element listadeitems;
	@Id("botonAnadir")
	private Button botonAnadir;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	public VistaLista() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	 

	public Button getBorrar() {
		return borrar;
	}

	public void setBorrar(Button borrar) {
		this.borrar = borrar;
	}

	public Element getListadeitems() {
		return listadeitems;
	}

	public void setListadeitems(Element listadeitems) {
		this.listadeitems = listadeitems;
	}

	public Button getBotonAnadir() {
		return botonAnadir;
	}

	public void setBotonAnadir(Button botonAnadir) {
		this.botonAnadir = botonAnadir;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

}