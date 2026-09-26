/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.controller;


import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import org.rp.model.Usuario;
import org.rp.system.Principal;
import org.rp.manager.SesionContext;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author ronald pico
 */
public class EmpleadoController implements Initializable {

    @FXML private Label lblBienvenida;
    @FXML private Label lblRol;
    @FXML private Button btnCerrarSesion;
    @FXML private Circle avatarCircle;

    @FXML private Button btnInventario;
    @FXML private Button btnLibro;
    @FXML private Button btnAutor;
    @FXML private Button btnCategoria;
    @FXML private Button btnEditorial;
    @FXML private Button btnClientes;

    @FXML private VBox cardVerInventario;
    @FXML private VBox cardNuevoLibro;
    @FXML private VBox cardNuevoAutor;
    @FXML private VBox cardNuevaCategoria;
    @FXML private VBox cardNuevaEditorial;
    @FXML private VBox cardNuevoCliente;

    private Usuario usuarioActual;

    /**
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usuarioActual = SesionContext.getInstancia().getUsuarioActual();
        if (usuarioActual != null) {
            lblBienvenida.setText(usuarioActual.getUsername());
            String iniciales = usuarioActual.getUsername()
                    .substring(0, Math.min(2, usuarioActual.getUsername().length()))
                    .toUpperCase();
            lblRol.setText(iniciales + " · " + capitalize(usuarioActual.getRol()));
        } else {
            lblBienvenida.setText("Invitado");
            lblRol.setText("?? · Sin sesión");
        }
    }

    private String capitalize(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void cerrarSesion(ActionEvent evento) {
        SesionContext.getInstancia().cerrarSesion();
        navegar("/org/rp/view/fxml/InicioSesionView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irAInventario(ActionEvent evento) {
        navegar("/org/rp/view/fxml/InventarioView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irALibro(ActionEvent evento) {
        navegar("/org/rp/view/fxml/LibroView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irAAutor(ActionEvent evento) {
        navegar("/org/rp/view/fxml/AutorView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irACategoria(ActionEvent evento) {
        navegar("/org/rp/view/fxml/CategoriaView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irAEditorial(ActionEvent evento) {
        navegar("/org/rp/view/fxml/EditorialView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irAClientes(ActionEvent evento) {
        navegar("/org/rp/view/fxml/ClienteView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void verInventario(MouseEvent evento) {
        navegar("/org/rp/view/fxml/InventarioView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void nuevoLibro(MouseEvent evento) {
        navegar("/org/rp/view/fxml/LibroView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void nuevoAutor(MouseEvent evento) {
        navegar("/org/rp/view/fxml/AutorView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void nuevaCategoria(MouseEvent evento) {
        navegar("/org/rp/view/fxml/CategoriaView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void nuevaEditorial(MouseEvent evento) {
        navegar("/org/rp/view/fxml/EditorialView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void nuevoCliente(MouseEvent evento) {
        navegar("/org/rp/view/fxml/ClienteView.fxml");
    }

    private void navegar(String ruta) {
        try {
            Principal.cambiarEscena(ruta);
        } catch (IOException | NullPointerException e) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION,
                    "Esta sección estará disponible próximamente.", ButtonType.OK);
            alerta.setTitle("En construcción");
            alerta.setHeaderText(null);
            alerta.showAndWait();
        }
    }
}