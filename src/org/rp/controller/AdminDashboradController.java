/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import org.rp.manager.SesionContext;
import org.rp.model.Usuario;
import org.rp.system.Principal;

/**
 *
 * @author USUARIO
 */
public class AdminDashboradController implements Initializable {

    @FXML private Label lblBienvenida;
    @FXML private Label lblRol;
    @FXML private Button btnCerrarSesion;
    @FXML private Circle avatarCircle;
    @FXML private Button btnUsuario;
    @FXML private Button btnLibro;
    @FXML private Button btnAutor;
    @FXML private Button btnCategoria;
    @FXML private Button btnEditorial;
    @FXML private Button btnVentas;
    @FXML private Button btnAutorLibro;
    @FXML private Button btnDetalleVenta;
    @FXML private VBox cardNuevoLibro;
    @FXML private VBox cardAgregarVenta;
    @FXML private VBox cardVerInventario;
    @FXML private VBox cardGestionarUsuarios;
    @FXML private VBox cardReportes;
    @FXML private VBox cardConfiguracion;

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
    public void irAUsuario(ActionEvent evento) {
        navegar("/org/rp/view/fxml/UsuarioView.fxml");
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
    public void irAVentas(ActionEvent evento) {
        navegar("/org/rp/view/fxml/ListaVentasView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irAAutorLibro(ActionEvent evento) {
        navegar("/org/rp/view/fxml/AutorLibroView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irADetalleVenta(ActionEvent evento) {
        navegar("/org/rp/view/fxml/DetalleVentaView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void irAClientes(ActionEvent evento) {
        try {
            Principal.cambiarEscena("/org/rp/view/fxml/ClienteView.fxml");
        } catch (IOException e) {
            System.err.println("Error al cargar clientes: " + e.getMessage());
            
        }
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void nuevoLibro(MouseEvent evento) {
        navegar("/org/rp/view/fxml/LibroFormView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void agregarVenta(MouseEvent evento) {
        navegar("/org/rp/view/fxml/VentaView.fxml");
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
    public void gestionarUsuarios(MouseEvent evento) {
        navegar("/org/rp/view/fxml/GestionUsuariosView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void reportes(MouseEvent evento) {
        navegar("/org/rp/view/fxml/ReportesView.fxml");
    }

    /**
     *
     * @param evento
     */
    @FXML
    public void configuracion(MouseEvent evento) {
    navegar("/org/rp/view/fxml/ConfiguracionView.fxml");
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

    /**
     *
     * @param usuario
     */
    public void iniciarUsuario(Usuario usuario) {
        this.usuarioActual = usuario;
        lblBienvenida.setText(usuario.getUsername());
        String iniciales = usuario.getUsername()
            .substring(0, Math.min(2, usuario.getUsername().length()))
            .toUpperCase();
        lblRol.setText(iniciales + " · " + capitalize(usuario.getRol()));
    }
}

