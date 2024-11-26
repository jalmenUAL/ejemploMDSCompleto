import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-aadir')
export class VistaAadir extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="position:absolute; width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: stretch;">
  <vaadin-text-field label="Texto" placeholder="Escriba el texto que desea añadir" id="Texto" style="flex-grow: 1; flex-shrink: 0;" type="text"></vaadin-text-field>
  <vaadin-button id="BotonAñadir" style="align-self: flex-end;" tabindex="0">
    Añadir 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-button id="botonCancelar" tabindex="0">
  Cancelar
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
