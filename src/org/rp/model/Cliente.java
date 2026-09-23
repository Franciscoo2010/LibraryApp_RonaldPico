
package org.rp.model;

/**
 *
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.Cliente
 * se crea la clase cliente
 * se define la varibale del objeto
 */
public class Cliente {
    private long cui;
    private String nombreCliente;
    private String apellidoCliente;
    private String correoElectronico;
/**
 * crea el parameto vacio osea se crea el objeto cliente
 * 
 */
    public Cliente() {
    }
    /**
     * se crea el objeto con los datos 
     * @param cui identificador 
     * @param nombreCliente nombre del cliente 
     * @param apellidoCliente apellido del cliente 
     * @param correoElectronico correo del cliente 
     */
    public Cliente(long cui, String nombreCliente, String apellidoCliente, String correoElectronico) {
        /**
         * se asigna los datoa a las variables 
         */
        this.cui = cui;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoElectronico = correoElectronico;
    }
/**
 * se crean los getter and setter para poder interactuar con los private
 * 
 */
    public long getCui() {
        return cui;
    }

    public void setCui(long cui) {
        this.cui = cui;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    /**
     * nos devuelve el apellido del cliente y el nombre 
     * @return 
     */
      @Override
    public String toString() {
        return nombreCliente + "" + apellidoCliente;
    }
    
}
