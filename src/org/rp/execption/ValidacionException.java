/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.execption;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class ValidacionException extends Exception {
    

    private static final Logger log = Logger.getLogger(ValidacionException.class.getName());
    
    /**
     *
     * @param mensaje
     */
    public ValidacionException(String mensaje) {
        super(mensaje);
    }

    /**
     *
     * @param valor
     * @param nombreCampo
     * @throws ValidacionException
     */
    public static void validarNoVacio(String valor, String nombreCampo)
        throws ValidacionException {
        if (valor == null || valor.trim().isEmpty()) {
            throw new ValidacionException(
                    "El campo " + nombreCampo + " no puede estar vacío.");
        }
        
        log.log(Level.WARNING, "No puede estar vacío el campo: ", nombreCampo);

    }

    /**
     *
     * @param a
     * @param b
     * @param mensaje
     * @throws ValidacionException
     */
    public static void validarCoinciden(String a, String b, String mensaje)
        throws ValidacionException {
        if (!a.equals(b)) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     *
     * @param valor
     * @param min
     * @param mensaje
     * @throws ValidacionException
     */
    public static void validarLongitudMinima(String valor, int min, String mensaje)
        throws ValidacionException {
        if (valor.length() < min) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     *
     * @param obj
     * @param mensaje
     * @throws ValidacionException
     */
    public static void validarNoNulo(Object obj, String mensaje)
        throws ValidacionException {
        if (obj == null) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     *
     * @param valor
     * @param nombreCampo
     * @throws ValidacionException
     */
    public static void validarNumero(String valor, String nombreCampo)
        throws ValidacionException {
        try {
            Long.parseLong(valor.trim());
        } catch (NumberFormatException e) {
            throw new ValidacionException(
                    "El campo " + nombreCampo + " debe ser un número válido.");
        }
    }

    /**
     *
     * @param valor
     * @param longitud
     * @param mensaje
     * @throws ValidacionException
     */
    public static void validarLongitudExacta(String valor, int longitud, String mensaje)
        throws ValidacionException {
        if (valor.length() != longitud) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     *
     * @param valor
     * @param mensaje
     * @throws ValidacionException
     */
    public static void validarFormatoEmail(String valor, String mensaje)
        throws ValidacionException {
        if (!valor.matches("[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+")) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     *
     * @param valor
     * @param nombreCampo
     * @throws ValidacionException
     */
    public static void validarDecimal(String valor, String nombreCampo)
        throws ValidacionException {
        try {
            Double.parseDouble(valor.trim());
        } catch (NumberFormatException e) {
            throw new ValidacionException(
                    "El campo " + nombreCampo + " debe ser un número válido.");
        }
    }

    /**
     *
     * @param valor
     * @param mensaje
     * @throws ValidacionException
     */
    public static void validarFormatoFecha(String valor, String mensaje)
        throws ValidacionException {
        if (!valor.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     *
     * @param valor
     * @param nombreCampo
     * @throws ValidacionException
     */
    public static void validarPositivo(String valor, String nombreCampo)
        throws ValidacionException {
        validarNumero(valor, nombreCampo);
        if (Long.parseLong(valor.trim()) <= 0) {
            throw new ValidacionException(
                    "El campo " + nombreCampo + " debe ser un número mayor que cero.");
        }
    }
}