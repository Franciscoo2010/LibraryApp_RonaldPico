/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 *
 * @author Ronald Pico
 * @see org.rp.model.Editorial
 * @version 1.0.0
 * se creo la clase editorial
 * se definio los atributos 
 */
public class Editorial {
    
    private String nit;
    private String nombreEditorial;
    private String telefonoEditorial;
    private String direccionEditoria;
/**
 * se crea el objeto con parametro vacio
 */
    public Editorial() {
    }
    /**
     * se ponen los datos o parametros al objeto 
     * @param nit nit de la editorial quien producio e libro 
     * @param nombreEditorial nombre de la editorial 
     * @param telefonoEditorial telefono de la editorial 
     * @param direccionEditorial direccion de la editorial 
     */
    public Editorial(String nit, String nombreEditorial, String telefonoEditorial, String direccionEditorial){
        this.nit = nit;
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccionEditoria = direccionEditoria;   
    }
    /**
     * se crean los getter and setter para poder interactuar con los private
     * @return 
     */
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getTelefonoEditorial() {
        return telefonoEditorial;
    }

    public void setTelefonoEditorial(String telefonoEditorial) {
        this.telefonoEditorial = telefonoEditorial;
    }

    public String getDireccionEditoria() {
        return direccionEditoria;
    }

    public void setDireccionEditoria(String direccionEditoria) {
        this.direccionEditoria = direccionEditoria;
    }
    /**
     * nos devuelve el nombre de la editorial 
     * @return 
     */
    @Override
    public String toString (){
        return nombreEditorial;
    }

}
