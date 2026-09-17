/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 *
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.Categoria
 * crea la clase 
 * define la variable del objeto 
 */
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
    /*
    *crea el objeto con parametro vacio
    */
    public Categoria(){
        
    }
    /**
     * se crea el objeto con parametros 
     * @param idCategoria
     * @param nombreCategoria 
     */
    public Categoria(int idCategoria, String nombreCategoria){
        /**
         * se asigna los datos a las variables
         */
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        
    }
/**
 * se crean los getter and setter para interactuar con los provate 
 * @return 
 */
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    
}
