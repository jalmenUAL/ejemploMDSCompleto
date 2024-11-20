import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-lista_item')
export class VistaLista_item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 100%; height: 100%; flex-grow: 1; align-self: stretch; flex-shrink: 0;">
  <span id="nick" style="flex-grow: 0; flex-shrink: 0; align-self: stretch;">Nick</span>
  <span id="texto" style="flex-grow: 1; align-self: stretch;">Texto </span>
  <vaadin-button id="seleccionar" tabindex="0" style="align-self: stretch;">
    Seleccionar 
  </vaadin-button>
  <vaadin-button id="modificar" tabindex="0" style="align-self: stretch;">
    Modificar 
  </vaadin-button>
  <vaadin-button id="botonverdetalles" tabindex="0">
   Ver detalles
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
