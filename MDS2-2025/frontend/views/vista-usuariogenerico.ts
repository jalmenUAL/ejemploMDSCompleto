import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-usuariogenerico')
export class VistaUsuariogenerico extends LitElement {
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
<vaadin-vertical-layout style="position:absolute; width: 100%; height: 100%; align-items: stretch;" id="layoutprincipal">
 <span style="font-size: 40px;color:DodgerBlue;">Bienvenido al ejemplo de MDS2</span>
 <vaadin-horizontal-layout theme="spacing" id="barrademenu" style="align-self: stretch; flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-m);">
  <vaadin-button id="modificarperfil" tabindex="0" style="flex-grow: 1;">
    Modificar Perfil 
  </vaadin-button>
  <vaadin-button id="Registrarse" tabindex="0" style="flex-grow: 1;">
    Registrarse 
  </vaadin-button>
  <vaadin-button id="Login" tabindex="0" style="flex-grow: 1;">
    Login 
  </vaadin-button>
  <vaadin-button id="Logout" tabindex="0" style="flex-grow: 1;">
    Logout 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="contenido" style="align-self: stretch; flex-grow: 1; flex-shrink: 0;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
