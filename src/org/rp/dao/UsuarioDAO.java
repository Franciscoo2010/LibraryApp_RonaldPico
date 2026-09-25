/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rp.dao;

/**
 *
 * @author USUARIO
 */

import java.util.ArrayList;
import org.rp.model.Usuario;

/**
 *
 * @author aruba
 */
public interface UsuarioDAO {

    /**
     *
     * @param usernarme
     * @param passwordHash
     * @return
     */
    public Usuario iniciarSesion(String usernarme, String passwordHash);

    /**
     *
     * @param usuario
     * @return
     */
    public boolean crearUsuario(Usuario usuario);

    /**
     *
     * @param usuario
     * @return
     */
    public boolean actualizarUsuario(Usuario usuario);

    /**
     *
     * @param idUsuario
     * @param passwordHash
     * @return
     */
    public boolean cambiarPassword(int idUsuario, String passwordHash);

    /**
     *
     * @param idUsuario
     * @return
     */
    public boolean desactivarUsuario(int idUsuario);

    /**
     *
     * @param idUsuario
     * @return
     */
    public boolean eliminarUsuario(int idUsuario);

    /**
     *
     * @return
     */
    public ArrayList<Usuario> listarTodosUsuarios();

    /**
     *
     * @param idUsuario
     * @return
     */
    public Usuario obtenerUsuarioPorId(int idUsuario);
}

