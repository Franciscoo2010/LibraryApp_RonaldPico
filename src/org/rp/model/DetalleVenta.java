/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 * se crea la clase DetalleVenta se declaran  los atributos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.DetalleVenta
 */
public class DetalleVenta {
     private int idDetalleVenta;
    private int noVenta;
    private String isbn;
    private int cantidad;
    private double precio;
    
    /**
     * Constructor vacio se crea el objeto detalle venta
     */
    public DetalleVenta(){
        
    }

    /**
     *  objeto DetalleVenta con todos sus datos.
     *  
     * @param idDetalleVenta id de la venta 
     * @param noVenta numero de venta 
     * @param isbn identificador unico 
     * @param cantidad cantidade de vehta 
     * @param precio precio d la venta 
     */
    public DetalleVenta(int idDetalleVenta, int noVenta, String isbn, int cantidad, double precio) {
        this.idDetalleVenta = idDetalleVenta;
        this.noVenta = noVenta;
        this.isbn = isbn;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     Id detalle venta nos decuelve el ID
     * @return nosdevuelve el id del detalle venta 
     */
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    /**
     definine idDetalleVenta
     * @param idDetalleVenta es el identificador unico del detalle venta 
     */
    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    /**
     no venta nos decuelve el numero de venta
     * @return  regresa el numero de venta 
     */
    public int getNoVenta() {
        return noVenta;
    }

    /**
     establece noVenta
     * @param noVenta numero de venta 
     */
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    /**
     nos regresa el isbn del libro
     * @return nos devuelve el isbn del libro 
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     define isbn del libro 
     * @param isbn identificador unico 
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     nos devuelve la cantidad de venta 
     * @return      nos devuelve la cantidad de venta 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     establece o actualiza la cantidad de venta 
     * @param cantidad      establece o actualiza la cantidad de venta 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     autor nos regresa el precio de la venta 
     * @return      autor nos regresa el precio de la venta 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     establece o actualiza el precio de la venta 
     * @param precio      establece o actualiza el precio de la venta 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}