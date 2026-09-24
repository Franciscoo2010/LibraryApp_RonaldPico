/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 * se crea la clase Libro se declaran  los atributos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.Libro
 */
public class Libro {
      private String isbn;
    private String titulo;
    private String fechaPublicacion;
    private double precio;
    private int idCategoria;
    private String nitEditorial;
    private int stock;

    /**
     * Constructor vacio se crea el objeto libro
     */
    public Libro() {
    }

    /**
     *  objeto Libro con todos sus datos.
     *  
     * @param isbn identificador del libro
     * @param titulo nombre del libro
     * @param fechaPublicacion fecha en la que fue creada el libro  
     * @param precio precio en el que esta a la venta el libro 
     * @param idCategoria identificador numérico de la categoría a la que pertenece.
     * @param nitEditorial El NIT de la editorial que lo publico 
     * @param stock Cantidad de libros disponibles en el almacen 
     */
    public Libro(String isbn, String titulo, String fechaPublicacion, double precio, int idCategoria, String nitEditorial, int stock) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.nitEditorial = nitEditorial;
        this.stock = stock;
    }

    /**
     Id isbn nos decuelve el ID
     * @return nosdevuelve el isbn del libro 
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     definine isbn
     * @param isbn es el identificador del libro 
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     autor nos decuelve el titulo del libro
     * @return  regresa el nombre del libro 
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     establece titulo
     * @param titulo nombre del libro 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     nos regresa la fecha de publicacion del libro
     * @return nos devuelve la fecha en la que fue creada el libro 
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     define fecha de publicacion del libro 
     * @param fechaPublicacion fecha en la que fue creada el libro 
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     nos devuelve el precio del libro 
     * @return      nos devuelve el precio en el que esta a la venta el libro 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     establece o actualiza el precio del libro 
     * @param precio      establece o actualiza el precio en el que esta a la venta el libro 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     autor nos regresa el id de la categoria 
     * @return      autor nos regresa el identificador numérico de la categoría a la que pertenece 
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     establece o actualiza el id de la categoria 
     * @param idCategoria      establece o actualiza el identificador numérico de la categoría a la que pertenece 
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     autor nos regresa el nit de la editorial 
     * @return      autor nos regresa el NIT de la editorial que lo publico 
     */
    public String getNitEditorial() {
        return nitEditorial;
    }

    /**
     establece o actualiza el nit de la editorial 
     * @param nitEditorial      establece o actualiza el NIT de la editorial que lo publico 
     */
    public void setNitEditorial(String nitEditorial) {
        this.nitEditorial = nitEditorial;
    }

    /**
     autor nos regresa el stock del libro 
     * @return      autor nos regresa la cantidad de libros disponibles en el almacen 
     */
    public int getStock() {
        return stock;
    }

    /**
     establece o actualiza el stock del libro 
     * @param stock      establece o actualiza la cantidad de libros disponibles en el almacen 
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * nos devuelve el titulo del libro
     * @return nos regresa el titutlo del libro obtenido 
     */
    @Override
    public String toString() {
        return titulo;
    }
}