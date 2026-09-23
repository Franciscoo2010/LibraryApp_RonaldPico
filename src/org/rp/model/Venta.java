
package org.rp.model;

/**
 *
 * @author ronald pico
 * @see org.rp.model.Venta
 * @version 1.0.0
 * se crea la clase y se define las variables del objeto 
 */
public class Venta {
    private int noVenta;
    private String fechaVenta;
    private double totalVenta;
    private long cuiCliente;
    private int idUsuario;
    
    /**
     *se crea el objet Venta como parametro vacio 
     */
    public Venta(){
        
    }

    /**
     *  Crea una instancia de Venta con todos sus atributos definidos
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
 * 
 * se c rean los getter and setter para poder interacuar con los private  
 */
    
    public int getNoVenta() {
        return noVenta;
    }

 
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    
    public String getFechaVenta() {
        return fechaVenta;
    }


    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    
    public double getTotalVenta() {
        return totalVenta;
    }

    

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public long getCuiCliente() {
        return cuiCliente;
    }

  
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }


    public int getIdUsuario() {
        return idUsuario;
    }

 
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
       
    
}
