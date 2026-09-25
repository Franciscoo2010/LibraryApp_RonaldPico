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

/**
 *
 * @author USUARIO
 * @param <T>
 * @param <K>
 */
public interface Crud<T, K> {

    /**
     *
     * @param entidad
     * @return
     */
    boolean crear(T entidad);

    /**
     *
     * @param entidad
     * @return
     */
    boolean actualizar(T entidad);

    /**
     *
     * @param id
     * @return
     */
    boolean eliminar(K id);

    /**
     *
     * @param id
     * @return
     */
    T buscarPorId(K id);

    /**
     *
     * @return
     */
    ArrayList<T> listarTodos();
}
