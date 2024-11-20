import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/form-layout/src/vaadin-form-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-datosdeperfil')
export class VistaDatosdeperfil extends LitElement {
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
<vaadin-vertical-layout style="position:absolute;width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-form-layout id="vaadinFormLayout" style="width: 100%; height: 100%; flex-grow: 1; flex-shrink: 0;">
  <vaadin-text-field label="Nombre" id="nombre" type="text"></vaadin-text-field>
  <vaadin-text-field label="Nick" id="nick" type="text"></vaadin-text-field>
  <vaadin-text-field label="Correo" id="correo" type="text"></vaadin-text-field>
  <vaadin-text-field label="DNI" id="dni" type="text"></vaadin-text-field>
  <vaadin-button id="dardealta" tabindex="0">
    Dar de alta 
  </vaadin-button>
  <vaadin-button id="actualizar" tabindex="0">
    Actualizar 
  </vaadin-button>
  <vaadin-button id="cancelar" tabindex="0">
   Cancelar
  </vaadin-button>
 </vaadin-form-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
