/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.manager;

import org.rp.model.Usuario;

/**
 * se crea la clase SesionContext y  se asignan los atributos 
 *  Administra el contexto de la sesión actual del usuario en la aplicación.
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.manager.SesionContext
 */

public class SesionContext {
    private static SesionContext instancia;
    private Usuario usuarioActual;
    private SesionContext() {
        
    }
    /**
     * nos d la instancia única de SesionContext.     * 
     * @return La instancia única de SesionContext.
     */
    public static synchronized SesionContext getInstancia() {
        
            if (instancia == null) {
                instancia = new SesionContext();
        }
            return instancia;
    }
    
  /**
   * crea los getter and setter para poder interactuar con los privatte 
   * @return  nos devuelve el usuario actual 
   */
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    /**
     * 
     * @param usuario del que se inicia sesion 
     */
    public void setUsuarioActual(Usuario usuario) {
        this.usuarioActual = usuario;
    }

    /***
     *  cierra la sesion del sistema 
     */
    public void cerrarSesion() {
        this.usuarioActual = null;
    }
}