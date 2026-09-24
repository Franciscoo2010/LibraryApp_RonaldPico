/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 * se crea la clase Venta se definen  los atributos 
 * @author ronald pico
 * @version 1.0.0
 * @see org.rp.model.Venta
 */
public class Venta {
    private int noVenta;
    private String fechaVenta;
    private double totalVenta;
    private long cuiCliente;
    private int idUsuario;
    
    /**
     * Constructor vacio se crea el objeto venta
     */
    public Venta(){
        
    }

    /**
     *  objeto Venta con todos sus datos.
     *  
     * @param noVenta numero de ventas hechas 
     * @param fechaVenta fecha en la que se realizo la venta 
     * @param totalVenta totall de la venta 
     * @param cuiCliente numer del cui del compraodr o cliente 
     * @param idUsuario id del usuario 
     */
    public Venta(int noVenta, String fechaVenta, double totalVenta, long cuiCliente, int idUsuario){
       this.noVenta = noVenta;
       this.fechaVenta = fechaVenta;
       this.totalVenta = totalVenta;
       this.cuiCliente = cuiCliente;
       this.idUsuario = idUsuario;
       
    }

    /**
     Id no venta nos decuelve el ID
     * @return nosdevuelve el numero de venta 
     */
    public int getNoVenta() {
        return noVenta;
    }

    /**
     definine noVenta
     * @param noVenta numero de ventas hechas 
     */
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    /**
     nos regresa la fecha de venta
     * @return nos devuelve la fecha en la que se realizo la venta 
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    /**
     define fecha de venta 
     * @param fechaVenta fecha en la que se realizo la venta 
     */
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     nos devuelve el total de la venta 
     * @return      nos devuelve el totall de la venta 
     */
    public double getTotalVenta() {
        return totalVenta;
    }

    /**
     establece o actualiza el total de la venta 
     * @param totalVenta      establece o actualiza el totall de la venta 
     */
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    /**
     Id cui cliente nos decuelve el ID
     * @return nosdevuelve el cui del cliente 
     */
    public long getCuiCliente() {
        return cuiCliente;
    }

    /**
     definine cuiCliente
     * @param cuiCliente numer del cui del compraodr o cliente 
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    /**
     autor nos decuelve el id del usuario
     * @return  regresa el id del usuario 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     establece idUsuario
     * @param idUsuario id del usuario 
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
        
    
}