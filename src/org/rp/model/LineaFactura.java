/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

/**
 * se crea la clase LineaFactura se asignan los atributos 
 * @author Ronald pico
 * @version 1.0.0
 * @see org.rp.model.LineaFactura
 */
public class LineaFactura {
    private int numeroFactura;
    private String fechaEmision;
    private long cuiCliente;
    private String nombreCliente;
    private String correoCliente;
    private String isbnLibro;
    private String tituloLibro;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private String usuarioAtendio;
    private double granTotal;

    /**
     * Constructor vacio se crea el objeto linea factura
     */
    public LineaFactura() {
    }

    /**
     Id numero factura nos decuelve el ID
     * @return nosdevuelve el numero de factura 
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     definine numeroFactura
     * @param numeroFactura es el numero de factura 
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     nos regresa la fecha de emision
     * @return nos devuelve la fecha de emision 
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     define fecha de emision 
     * @param fechaEmision fecha de emision 
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
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
     * @param cuiCliente es el cui del cliente 
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
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
     nos devuelve el correo del cliente 
     * @return      nos devuelve el correo del cliente 
     */
    public String getCorreoCliente() {
        return correoCliente;
    }

    /**
     establece o actualiza el correo del cliente 
     * @param correoCliente      establece o actualiza el correo del cliente 
     */
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    /**
     nos regresa el isbn del libro
     * @return nos devuelve el isbn del libro 
     */
    public String getIsbnLibro() {
        return isbnLibro;
    }

    /**
     define isbn del libro 
     * @param isbnLibro isbn del libro 
     */
    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    /**
     autor nos decuelve el titulo del libro
     * @return  regresa el titulo del libro 
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     establece tituloLibro
     * @param tituloLibro titulo del libro 
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    /**
     nos devuelve la cantidad 
     * @return      nos devuelve la cantidad 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     establece o actualiza la cantidad 
     * @param cantidad      establece o actualiza la cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     autor nos regresa el precio unitario 
     * @return      autor nos regresa el precio unitario 
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     establece o actualiza el precio unitario 
     * @param precioUnitario      establece o actualiza el precio unitario 
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     autor nos regresa el subtotal 
     * @return      autor nos regresa el subtotal 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     establece o actualiza el subtotal 
     * @param subtotal      establece o actualiza el subtotal 
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     autor nos regresa el usuario que atendio 
     * @return      autor nos regresa el usuario que atendio 
     */
    public String getUsuarioAtendio() {
        return usuarioAtendio;
    }

    /**
     establece o actualiza el usuario que atendio 
     * @param usuarioAtendio      establece o actualiza el usuario que atendio 
     */
    public void setUsuarioAtendio(String usuarioAtendio) {
        this.usuarioAtendio = usuarioAtendio;
    }

    /**
     autor nos regresa el gran total 
     * @return      autor nos regresa el gran total 
     */
    public double getGranTotal() {
        return granTotal;
    }

    /**
     establece o actualiza el gran total 
     * @param granTotal      establece o actualiza el gran total 
     */
    public void setGranTotal(double granTotal) {
        this.granTotal = granTotal;
    }  
}
