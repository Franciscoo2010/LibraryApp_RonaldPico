/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rp.dao;

/**
 * se crea la clase crud con sus variables t y k
 * @author Ronald Pico  
 */

import java.util.ArrayList;

/**
 *
 * se crea la clase crud con sus variables t y k
 * @author Ronald Pico  
 
 * @param <T> variable 
 * @param <K> variable 
 */
public interface Crud<T, K> {

    /**
     *
     * @param entidad tipo de tabla 
     * @return la entidad 
     */
    boolean crear(T entidad);

    /**
     *
     * @param entidad tipo de tabla 
     * @return la entidad 
     */
    boolean actualizar(T entidad);

    /**
     *
     * @param id identificador 
     * @return el id 
     */
    boolean eliminar(K id);

    /**
     *
     * @param id identificador 
     * @return el id 
     */
    T buscarPorId(K id);

    /**
     *
     * @return toda la lista 
     */
    ArrayList<T> listarTodos();
}
