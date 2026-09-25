/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.execption;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * se cre la clase Validar exception para validar los datos .
 * 
 * @author Ronald Francisco Pico Morataya
 */
public class ValidacionException extends Exception {

    private static final Logger log = Logger.getLogger(ValidacionException.class.getName());

    /**
     * Construye una nueva excepción de validación con el mensaje .
     * 
     * @param mensaje El texto que detalla el error de validación.
     */
    public ValidacionException(String mensaje) {
        super(mensaje);
    }

    /**
     * Valida que una cadena de texto   no esté vacía.
     * 
     * @param valor       La cosa que se evalua .
     * @param nombreCampo nombre de que se valida .
     * @throws ValidacionException si el valor es nulo o está vacío.
     */
    public static void validarNoVacio(String valor, String nombreCampo)
            throws ValidacionException {
        if (valor == null || valor.trim().isEmpty()) {
            log.log(Level.WARNING, "El campo {0} está vacío o es nulo.", nombreCampo);
            throw new ValidacionException("El campo " + nombreCampo + " no puede estar vacío.");
        }
    }

    /**
     * Valida si son los datos coinciden o son iguales 
     * 
     * @param a       Primer valor a comparar.
     * @param b       Segundo valor a comparar.
     * @param mensaje Mensaje de error personalizado si no coinciden.
     * @throws ValidacionException si las cadenas son diferentes.
     */
    public static void validarCoinciden(String a, String b, String mensaje)
            throws ValidacionException {
        if (!a.equals(b)) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     * Valida que una cadena cumpla con una longitud mínima de caracteres.
     * 
     * @param valor   La cadena de texto a evaluar.
     * @param min     La longitud mínima permitida.
     * @param mensaje Mensaje de error personalizado si no cumple el requisito.
     * @throws ValidacionException si la longitud es menor al mínimo.
     */
    public static void validarLongitudMinima(String valor, int min, String mensaje)
            throws ValidacionException {
        if (valor.length() < min) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     * Valida que un objeto no sea nulo.
     * 
     * @param obj     El objeto a evaluar.
     * @param mensaje Mensaje de error personalizado si el objeto es nulo.
     * @throws ValidacionException si el objeto es nulo.
     */
    public static void validarNoNulo(Object obj, String mensaje)
            throws ValidacionException {
        if (obj == null) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     * Valida que una cadena de texto represente un número entero válido.
     * 
     * @param valor       La cadena de texto a evaluar.
     * @param nombreCampo El nombre del campo que se está validando.
     * @throws ValidacionException si el texto no es un número válido.
     */
    public static void validarNumero(String valor, String nombreCampo)
            throws ValidacionException {
        try {
            Long.parseLong(valor.trim());
        } catch (NumberFormatException e) {
            throw new ValidacionException("El campo " + nombreCampo + " debe ser un número válido.");
        }
    }

    /**
     * Valida que una cadena tenga una longitud exacta de caracteres.
     * 
     * @param valor    La cadena de texto a evaluar.
     * @param longitud La longitud exacta requerida.
     * @param mensaje  Mensaje de error personalizado si la longitud difiere.
     * @throws ValidacionException si la longitud no coincide con la esperada.
     */
    public static void validarLongitudExacta(String valor, int longitud, String mensaje)
            throws ValidacionException {
        if (valor.length() != longitud) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     * Valida que una cadena tenga un formato de correo electrónico válido.
     * 
     * @param valor   La cadena de texto a evaluar.
     * @param mensaje Mensaje de error personalizado si el formato es inválido.
     * @throws ValidacionException si el formato del correo no es correcto.
     */
    public static void validarFormatoEmail(String valor, String mensaje)
            throws ValidacionException {
        if (!valor.matches("[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+")) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     * Valida que una cadena de texto represente un número decimal válido.
     * 
     * @param valor       La cadena de texto a evaluar.
     * @param nombreCampo El nombre del campo que se está validando.
     * @throws ValidacionException si el texto no es un número decimal válido.
     */
    public static void validarDecimal(String valor, String nombreCampo)
            throws ValidacionException {
        try {
            Double.parseDouble(valor.trim());
        } catch (NumberFormatException e) {
            throw new ValidacionException("El campo " + nombreCampo + " debe ser un número válido.");
        }
    }

    /**
     * Valida que una cadena tenga un formato de fecha estándar (YYYY-MM-DD).
     * 
     * @param valor   La cadena de texto a evaluar.
     * @param mensaje Mensaje de error personalizado si el formato es incorrecto.
     * @throws ValidacionException si la fecha no cumple con el formato YYYY-MM-DD.
     */
    public static void validarFormatoFecha(String valor, String mensaje)
            throws ValidacionException {
        if (!valor.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new ValidacionException(mensaje);
        }
    }

    /**
     * Valida que una cadena represente un número entero estrictamente positivo (> 0).
     * 
     * @param valor       La cadena de texto a evaluar.
     * @param nombreCampo El nombre del campo que se está validando.
     * @throws ValidacionException si el número es menor o igual a cero o no es válido.
     */
    public static void validarPositivo(String valor, String nombreCampo)
            throws ValidacionException {
        validarNumero(valor, nombreCampo);
        if (Long.parseLong(valor.trim()) <= 0) {
            throw new ValidacionException("El campo " + nombreCampo + " debe ser un número mayor que cero.");
        }
    }
}