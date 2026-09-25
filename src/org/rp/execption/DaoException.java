/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.execption;

/**
* Excepción personalizada para manejar los errores ocurridos en la capa DAO.
* @author Ronald Pico 
 */
public class DaoException extends RuntimeException {

    /**
     *nos devuelve el mensaje cuando pas el eeror 
     * @param mensaje tipo de texto que regresa 
     */
    public DaoException(String mensaje) {
        super(mensaje);
    }

    /**
     *Mensaje se devuelve la causa del error 
     * @param mensaje
     * @param causa
     */
    public DaoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}

