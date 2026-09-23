/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 * se crea la clase Autor se asignan los atributos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.Autor
 */
public class Autor {
    private int idAutor;
    private String nombreAutor;
    private String apellidoAutor;
    private String nacionalidad;
    private String biografia;
    /**
     * Constructor vacio se crea el objeto autor
     */
    public Autor(){

    }
/**
     *  objeto Autor con todos sus datos.
     * 
     * @param idAutor Identificador único del autor.
     * @param nombreAutor Nombre  del autor.
     * @param apellidoAutor Apellido del autor.
     * @param nacionalidad País en que nacio el autor.
     * @param biografia  histaoria del  autor.
     */
    public Autor(int idAutor, String nombreAutor, String apellidoAutor, String nacionalidad, String biografia){
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor; 
        this.apellidoAutor = apellidoAutor;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }
 /**
  
    Id autor nos decuelve el ID
     * @return nosdevuelve el id del autor 
    */
    public int getIdAutor() {
        return idAutor;
    }
   /**
    definine idAUtor
     * @param idAutor es el identificador unico del autor 
    */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
/**
     autor nos decuelve el nombre del autor
     * @return  regresa el nombre del autor 
    */
    public String getNombreAutor() {
        return nombreAutor;
    }
    /**
    establece nombreAutor
     * @param nombreAutor nombr el autor 
    */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
/**
    nos regresa el apellido del autor
     * @return nos devuelve el apellido del autor 
        */
    public String getApellidoAutor() {
        return apellidoAutor;
    }

    /**
     define apelido del autor 
     * @param apellidoAutor apellido del autor 
    */
    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }
/**
     nos devuelve la nacionalidad del autor 
     * @return      nos devuelve la nacionalidad del autor 

    */
    public String getNacionalidad() {
        return nacionalidad;
    }
/**
     establece o actualiza na nacionalidad del autor 
     * @param nacionalidad      establece o actualiza na nacionalidad del autor 

    */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
/**
     autor nos regresa la biografia del autor 
     * @return      autor nos regresa la biografia del autor 

    */
    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    /**
    * nos devuelve el apellido del autor juntos 
    */
    @Override
    public String toString() {
        return nombreAutor + "" + apellidoAutor;
    }
}
