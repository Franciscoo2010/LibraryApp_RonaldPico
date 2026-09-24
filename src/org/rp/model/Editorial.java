/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 * se crea la clase Editorial se asignan los atributos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.Editorial
 */
public class Editorial {
    
    private String nit;
    private String nombreEditorial;
    private String telefonoEditorial;
    private String direccionEditoria;

    /**
     * Constructor vacio se crea el objeto editorial
     */
    public Editorial() {
    }

    /**
     *  objeto Editorial con todos sus datos.
     *  
     * @param nit nit de la editorial quien producio e libro 
     * @param nombreEditorial nombre de la editorial 
     * @param telefonoEditorial telefono de la editorial 
     * @param direccionEditorial direccion de la editorial 
     */
    public Editorial(String nit, String nombreEditorial, String telefonoEditorial, String direccionEditorial){
        this.nit = nit;
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccionEditoria = direccionEditorial;    
    }

    /**
     Id nit nos decuelve el ID
     * @return nosdevuelve el nit de la editorial 
     */
    public String getNit() {
        return nit;
    }

    /**
     definine nit
     * @param nit es el nit de la editorial 
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     autor nos decuelve el nombre de la editorial
     * @return  regresa el nombre de la editorial 
     */
    public String getNombreEditorial() {
        return nombreEditorial;
    }

    /**
     establece nombreEditorial
     * @param nombreEditorial nombre de la editorial 
     */
    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    /**
     nos regresa el telefono de la editorial
     * @return nos devuelve el telefono de la editorial 
     */
    public String getTelefonoEditorial() {
        return telefonoEditorial;
    }

    /**
     define telefono de la editorial 
     * @param telefonoEditorial telefono de la editorial 
     */
    public void setTelefonoEditorial(String telefonoEditorial) {
        this.telefonoEditorial = telefonoEditorial;
    }

    /**
     nos devuelve la direccion de la editorial 
     * @return      nos devuelve la direccion de la editorial 
     */
    public String getDireccionEditoria() {
        return direccionEditoria;
    }

    /**
     establece o actualiza la direccion de la editorial 
     * @param direccionEditoria      establece o actualiza la direccion de la editorial 
     */
    public void setDireccionEditoria(String direccionEditoria) {
        this.direccionEditoria = direccionEditoria;
    }

    /**
     * nos devuelve el nombre de la editorial 
     * @return nos devuelve el nombre de la editorial 
     */
    @Override
    public String toString (){
        return nombreEditorial;
    }

}