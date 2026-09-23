/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 * se crea la clase Detalle venta 
 * se declara el atributo del objeto 

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
     * se creal el objeto con parrametro vacio
     */
    public DetalleVenta(){
        
    }
    /**
     * nos da el objeto con ya los datos incluidos 
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
     * se crean los getter and stter para interactuar con los privte  
     */

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getNoVenta() {
        return noVenta;
    }

    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
