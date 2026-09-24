
package org.rp.model;

/**
 * se crea la clase Cliente se asignan los atributos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.Cliente
 */
public class Cliente {
    private long cui;
    private String nombreCliente;
    private String apellidoCliente;
    private String correoElectronico;

    /**
     * Constructor vacio se crea el objeto cliente
     */
    public Cliente() {
    }

    /**
     *  objeto Cliente con todos sus datos.
     *  
     * @param cui identificador 
     * @param nombreCliente nombre del cliente 
     * @param apellidoCliente apellido del cliente 
     * @param correoElectronico correo del cliente 
     */
    public Cliente(long cui, String nombreCliente, String apellidoCliente, String correoElectronico) {
        this.cui = cui;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoElectronico = correoElectronico;
    }

    /**
     Id cui nos decuelve el ID
     * @return nosdevuelve el cui del cliente 
     */
    public long getCui() {
        return cui;
    }

    /**
     definine cui
     * @param cui es el identificador unico del cliente 
     */
    public void setCui(long cui) {
        this.cui = cui;
    }

    /**
     autor nos decuelve el nombre del cliente
     * @return  regresa el nombre del cliente 
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     establece nombreCliente
     * @param nombreCliente nombre del cliente 
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     nos regresa el apellido del cliente
     * @return nos devuelve el apellido del cliente 
     */
    public String getApellidoCliente() {
        return apellidoCliente;
    }

    /**
     define apellido del cliente 
     * @param apellidoCliente apellido del cliente 
     */
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    /**
     nos devuelve el correo electronico del cliente 
     * @return      nos devuelve el correo electronico del cliente 
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     establece o actualiza el correo electronico del cliente 
     * @param correoElectronico      establece o actualiza el correo electronico del cliente 
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * nos devuelve el apellido del cliente y el nombre 
     * @return nos devuelve el nombre y apellido del cliente 
     */
     @Override
    public String toString() {
        return nombreCliente + "" + apellidoCliente;
    }
    
}