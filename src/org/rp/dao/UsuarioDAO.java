/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rp.dao;

/**
 * se crea la clse usuario con sus datos 
 * @author Ronald Pico
 */

import java.util.ArrayList;
import org.rp.model.Usuario;
/**
 * se crea la clse usuario con sus datos 
 * @author Ronald Pico
 */
public interface UsuarioDAO {

    /**
     * inicio de ssesion 
     * @param usernarme usuario con nombre del usuario 
     * @param passwordHash contraseña del suaurio inisiaso 
     * @return nos regrea el nombre y la comntra 
     */
    public Usuario iniciarSesion(String usernarme, String passwordHash);

    /** 
     * creacion del usuarioo 
     * @param usuario nombre o el objeto con el que se incia sesion
     * @return nos devuelve el usuario creado 
     */
    public boolean crearUsuario(Usuario usuario);

    /**
     * actualiza el ususario 
     * @param usuario nombre o el objeto con el que se incia sesion
     * @return nos devuelve el usuario 
     */
    public boolean actualizarUsuario(Usuario usuario);

    /**
     *Cambio de contraseña 
     * @param idUsuario identificador unico del usuario 
     * @param passwordHash contraseña del user 
     * @return nos regresa la nueva contraseña 
     */
    public boolean cambiarPassword(int idUsuario, String passwordHash);

    /**
     * Desactivar el Usario  
     * @param idUsuario identificador unico del usuario
     * @return nos devuelve un usuafio menos 
     */
    public boolean desactivarUsuario(int idUsuario);

    /**
     * elimina el Usuario  
     * @param idUsuario
     * @return
     */
    public boolean eliminarUsuario(int idUsuario);

    /**
     *Lista todos los usuarios 
     * @return la lista de los usuaruios 
     */
    public ArrayList<Usuario> listarTodosUsuarios();

    /**
     *busca por id el usuario 
     * @param idUsuario identificador unico 
     * @return ide del usaurio 
     */
    public Usuario obtenerUsuarioPorId(int idUsuario);
}

