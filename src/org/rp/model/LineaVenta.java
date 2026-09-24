
package org.rp.model;

/**
 * se crea la clase Linea venrtay se definen las variables y 
 * Clase que representa los libros vendidos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.LineaVenta
 */
public class LineaVenta {
    private Libro libro;
    private int cantidad;
    
    /**
     * Constructor vacío  sin  sus atributos.
     */
    public LineaVenta(){
        
    }
    
    /**
     * Crea una instancia de LineaVenta con el libro y la cantidad especificados.
     * 
     * @param libro Objeto se incluye en la venta.
     * @param cantidad Cantidad de libros vendidos.
     */
    public LineaVenta (Libro libro, int cantidad){
        this.libro = libro;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el libro asociado a esta línea de venta.
     * 
     * @return  Libro correspondiente.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Establece o actualiza el libro asociado a esta línea de venta.
     * 
     * @param libro El objeto Libro a asignar.
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Obtiene la los libros vendidos .
     * 
     * @return La cantidad de libros.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece o actualiza la cantidad de  ventas.
     * 
     * @param cantidad La cantidad a asignar.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}