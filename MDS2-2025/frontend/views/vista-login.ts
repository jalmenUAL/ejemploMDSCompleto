import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-login')
export class VistaLogin extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="flex-grow: 1;">
   <vaadin-text-field label="Login" placeholder="Introduzca el login" id="login" type="text" style="flex-grow: 1; align-self: stretch;"></vaadin-text-field>
   <vaadin-button id="botonlogin" tabindex="0" style="flex-grow: 1; align-self: stretch;">
     Login 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1;">
   <vaadin-text-field label="Password" placeholder="Introduzca el password" id="password" type="text" style="flex-grow: 1; align-self: stretch;"></vaadin-text-field>
   <vaadin-button id="cancelar" style="flex-grow: 1; align-self: stretch;" tabindex="0">
    Cancelar
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
