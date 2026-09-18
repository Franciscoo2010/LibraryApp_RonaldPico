

package org.rp.model;

/**
 *
 * @author Ronald Pico
 * @version 1.0.0 
 * @see org.rp.model.Libro
 * se creo la clase Libro
 * se definio los atributos 
 * 
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
     * se crea el parametro vacio eel objeto libro 
     */
    public Libro() {
    }
/**
 * se da los datos del objeto parametro no vacio 
 * @param isbn identificador del libro
 * @param titulo nombre del libro
 * @param fechaPublicacion fecha en la que fue creada el libro  
 * @param precio precio en el que esta a la venta el libro 
 * @param idCategoria identificador numérico de la categoría a la que pertenece.
 * @param nitEditorial El NIT de la editorial que lo publico 
 * @param stock Cantidad de libros disponibles en el almacen 
 */
    public Libro(String isbn, String titulo, String fechaPublicacion, double precio, int idCategoria, String nitEditorial, int stock) {
        /**
         * se asigna los datos a las variables 
         */
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.nitEditorial = nitEditorial;
        this.stock = stock;
    }
    /**
     * se crean los getter and setter para interactuar con los private 
     * 
     */
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNitEditorial() {
        return nitEditorial;
    }

    public void setNitEditorial(String nitEditorial) {
        this.nitEditorial = nitEditorial;
    }

    public int getStock() {
        return stock;
    }

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
