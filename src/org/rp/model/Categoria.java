/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 * se crea la clase Categoria se asignan los atributos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.Categoria
 */
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;

    /**
     * Constructor vacio se crea el objeto categoria
     */
    public Categoria(){
        
    }

    /**
     *  objeto Categoria con todos sus datos.
     *  
     * @param idCategoria id de la categoria
     * @param nombreCategoria nombre de la categoria 
     */
    public Categoria(int idCategoria, String nombreCategoria){
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        
    }

    /**
     Id categoria nos decuelve el ID
     * @return nosdevuelve el id de la categoria 
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     definine idCategoria
     * @param idCategoria es el identificador unico de la categoria 
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     autor nos decuelve el nombre de la categoria
     * @return  regresa el nombre de la categoria 
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     establece nombreCategoria
     * @param nombreCategoria nombre de la categoria 
     */
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    /**
     * nos regresa el nombre de la categoria
     * @return nos devuelve el nombre de la categoria 
     */
    @Override
    public String toString() {
        return nombreCategoria;
    }
    
}
