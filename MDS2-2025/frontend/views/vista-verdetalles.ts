import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verdetalles')
export class VistaVerdetalles extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: stretch;">
  <label id="label" style="flex-grow: 1; ">Nick:</label>
  <span id="nick" style="align-self: center; flex-grow: 1;">Nick</span>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: stretch;">
  <label id="label2" style="flex-grow: 1; ">Correo:</label>
  <span id="correo" style="align-self: center; flex-grow: 1;">Correo</span>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: stretch;">
  <label id="label1" style="flex-grow: 1; ">Texto:</label>
  <span id="texto" style="align-self: center; flex-grow: 1;">Texto</span>
 </vaadin-horizontal-layout>
 <vaadin-button id="volver" tabindex="0">
   Volver 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
