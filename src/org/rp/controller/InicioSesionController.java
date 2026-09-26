/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.controller;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.lang.classfile.Label;
import java.net.URL;
import java.util.ResourceBundle;
import org.rp.dao.UsuarioDAO;
import org.rp.dao.impl.UsuarioDAOImpl;
import org.rp.execption.DaoException;
import org.rp.execption.ValidacionException;
import org.rp.manager.SesionContext;
import org.rp.model.Usuario;
import org.rp.system.Principal;
import org.rp.util.SecurityUtil;

public class InicioSesionController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnIniciarSesion;
    @FXML
    private Label lblMensaje;

    private UsuarioDAO usuarioDAO;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usuarioDAO = new UsuarioDAOImpl();
        lblMensaje.setText("");
        txtUsuario.setOnAction(this::eventoInicioSesion);
        txtPassword.setOnAction(this::eventoInicioSesion);
    }

    @FXML
    public void eventoInicioSesion(ActionEvent evento) {
        try {
            ValidacionException.validarNoVacio(txtUsuario.getText(), "usuario");
            ValidacionException.validarNoVacio(txtPassword.getText(), "contraseña");
            String usuario = txtUsuario.getText();
            String password = txtPassword.getText();
            String passwordHash = SecurityUtil.hashSHA256(password);
            Usuario usuarioIniciado = usuarioDAO.iniciarSesion(usuario, passwordHash);

            if (usuarioIniciado != null) {
                mostrarAlerta(Alert.AlertType.INFORMATION, "Inicio correcto");
                abrirDashboard(usuarioIniciado);
            } else {
                mostrarAlerta(Alert.AlertType.ERROR, "Usuario o contraseña incorrectos");
            }
        } catch (ValidacionException e) {
            mostrarAlerta(Alert.AlertType.WARNING, e.getMessage());
            lblMensaje.setText(e.getMessage());
        } catch (DaoException e) {
            mostrarAlerta(Alert.AlertType.ERROR, e.getMessage());
            lblMensaje.setText("Error al iniciar sesión");
        }
    }

    @FXML
    public void eventoRegistrarse(ActionEvent evento) {
        try {
            Principal.cambiarEscena("/org/rp/view/fxml/RegistrarUsuarioView.fxml");
        } catch (IOException e) {
            System.err.println("Error al cargar registro: " + e.getMessage());
            lblMensaje.setText("Error interno");
        }
    }

    private void abrirDashboard(Usuario usuario) {
        SesionContext.getInstancia().setUsuarioActual(usuario);

        String rol = usuario.getRol();
        String rutaDashboard = "";
        switch (rol) {
            case "admin":
                rutaDashboard = "/org/rp/view/fxml/AdminDashboradView.fxml";
                break;
            case "cajero":
                rutaDashboard = "/org/rp/view/fxml/AdminDashboradView.fxml";
                break;
            case "empleado":
                rutaDashboard = "/org/rp/view/fxml/AdminDashboradView.fxml";
                break;
            default:
                throw new AssertionError();
        }

        if (rutaDashboard.equals("/org/rp/view/fxml/InicioSesionView.fxml")) {
            mostrarAlerta(Alert.AlertType.ERROR, "Rol desconocido: " + usuario.getRol());
            SesionContext.getInstancia().cerrarSesion();
            return;
        }
        try {
            Principal.cambiarEscena(rutaDashboard);
        } catch (IOException e) {
            System.err.println("Error al cargar la vista:" + rutaDashboard + e.getMessage());
            lblMensaje.setText("Error interno");
        }
    }

    private void mostrarAlerta(Alert.AlertType tipo, String mensaje) {
        Alert alerta = new Alert(tipo, mensaje, ButtonType.OK);
        alerta.showAndWait();
    }
}

