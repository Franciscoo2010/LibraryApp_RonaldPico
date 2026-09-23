
package org.rp.model;

/**
 *
 * @author Ronald pico
 * @see org.rp.model.LineaFactura
 * @version 1.0.0
 * se crea la clase LineaFactura
 * se define las varibales del objeto como private 
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
     * se crea el objeto Linea facturaa como parametro vacio
     */
    public LineaFactura() {
    }

    /**
     * se crean los getter and setter para interacturar los con los private del encapsulamiento 
     * 
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public long getCuiCliente() {
        return cuiCliente;
    }

    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getUsuarioAtendio() {
        return usuarioAtendio;
    }

    public void setUsuarioAtendio(String usuarioAtendio) {
        this.usuarioAtendio = usuarioAtendio;
    }

    public double getGranTotal() {
        return granTotal;
    }

    public void setGranTotal(double granTotal) {
        this.granTotal = granTotal;
    }  
}
