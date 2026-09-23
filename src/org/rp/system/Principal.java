
package org.rp.system;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.logging.Level;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.logging.Logger;
import org.rp.manager.SesionContext;
import org.rp.model.Usuario;

/**
 * crea la clase principal con la extencion aplicacionn
 * @author Ronald Pico 
 * @version 1.0.0
 * @see   org.rp.system.Principal
 */
public class Principal extends Application {
    /**
     * define los atributos 
     */
    private static Stage escenarioPrincipal;
    private static final Logger log = Logger.getLogger (Principal.class.getName());

    /**
     *  sambia la eescena c el fxml
     * @param rutaFXML ruta para cargar el archivo 
     * @throws IOException si da error al cambirar la escena 
     */
    public static void cambiarEscena(String rutaFXML) throws IOException {
        log.log(Level.INFO, "Se cambio de escena a:{0}", rutaFXML);
        Parent raiz = FXMLLoader.load(
         Principal.class.getResource(rutaFXML));
        Scene escena = new Scene(raiz);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        escenarioPrincipal.centerOnScreen();
        escenarioPrincipal.show();
    }

    /**
     * obtiene los datos del susuario y con el roll inica el dashbard del rol 
     * 
     */
    public static String rutaDashboardSegunRol() {
        Usuario usuario = SesionContext.getInstancia().getUsuarioActual();
        if (usuario == null || usuario.getRol() == null) {
            return "/org/rp/view/fxml/InicioSesionView.fxml";
        }
        switch (usuario.getRol().toLowerCase()) {
            case "admin":
                return "/org/rp/view/fxml/AdminDashboradView.fxml";
            case "empleado":
                return "/org/rp/view/fxml/EmpleadoView.fxml";
            case "cajero":
                return "/org/rp/view/fxml/CajeroView.fxml";
            default:
                return "/org/rp/view/fxml/InicioSesionView.fxml";
        }
    }

    /**
     *inicia el programa 
     * @param args
     */
    public static void main(String[] args) {
        log.info("Se inicio el programa");
        launch(args);

    }

    /**
     * inica la vista el java fx
     * @param escenarioPrincipal
     * @throws Exception si pasa un error 
     */ 
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
       Principal.escenarioPrincipal = escenarioPrincipal;
       cambiarEscena("/org/rp/view/fxml/InicioSesionView.fxml");
    }
}

