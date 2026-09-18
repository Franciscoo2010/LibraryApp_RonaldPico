
package org.rp.model;

/**
 *
 * @author ronald pico
 * @see org.rp.model.LineaVenta
 * @version 1.0.0
 * se crea la clase LineaVenta 
 * se define variables 
 */
public class LineaVenta {
    private Libro libro;
    private int cantidad;
    
    /**
     * se crea el objeto LineaVenta como prametro vacio 
     */
    public LineaVenta(){
        
    }
    
    /**
     *  * se da los datos del objeto parametro no vacio 
     * @param libro  objet de la venta 
     * @param cantidad cantidad de ventas 
     * 
     */
    
    public LineaVenta (Libro libro, int cantidad){
        /**
         * se asigna los datos a las varibales 
         */
        this.libro =libro;
        this.cantidad = cantidad;
    }
    /**
     * se crean los getter and setter para poder intercaturar con los private
     * @return 
     */

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
