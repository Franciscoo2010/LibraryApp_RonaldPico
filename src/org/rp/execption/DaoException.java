/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.execption;

/**
 *
 * @author USUARIO
 */
public class DaoException extends RuntimeException {

    /**
     *
     * @param mensaje
     */
    public DaoException(String mensaje) {
        super(mensaje);
    }

    /**
     *
     * @param mensaje
     * @param causa
     */
    public DaoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}

