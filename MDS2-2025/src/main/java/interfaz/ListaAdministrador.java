package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.texto;

public class ListaAdministrador extends Lista {
	// private event _borrar;
	public Administrador _administrador;

	ListaAdministrador(Administrador administrador) {
		 
		_administrador = administrador;

		texto[] elementos = this._administrador._iAdministrador.cargar();

		for (int i = 0; i < elementos.length; i++) {
			this.getListadeitems().as(VerticalLayout.class).add(new ListaAdministrador_item(this, elementos[i]));
		}

		this.getBotonAnadir().setVisible(false);
		this.getBorrar().setEnabled(false);
		
		this.getBorrar().addClickListener(event ->{		
			Borrar();
			
		}
		);
		 

	}

	public void Borrar() {

		for (int i = 0; i < _item.size(); i++) {
			_administrador._iAdministrador.borrar(_item.get(i).t.getID());
			
		}
		this.getBorrar().setEnabled(false);
		
		//RECARGA
		_administrador.MainView.removeAll();
		_administrador = new Administrador(_administrador.MainView);
		_administrador.MainView.add(_administrador);
		//
	}
}