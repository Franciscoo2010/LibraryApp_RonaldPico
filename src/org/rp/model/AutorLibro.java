
package org.rp.model;

/**
 *
 * @author Ronald Pico
 * @version  1.0.0
 * @see org.rp.model.AutorLibro
 */
public class AutorLibro {
    private int idAutorLibro;
    private int idAutor;
    private String isbn;
    /*
    * s crea el parametro vacio para poder crear elojeto 
    */
    public AutorLibro(){
    
}
    /*
    * se le asignanl los valores al parametro 
    */
    /**
     * 
     * @param idAutorLibro id del autor del libro
     * @param idAutor id del autor 
     * @param isbn  codigo unico 
     */
    public AutorLibro(int idAutorLibro, int idAutor, String isbn){
        this.idAutorLibro = idAutorLibro;
        this.idAutor = idAutor;
        this.isbn = isbn;
    }
/*
    * SE hacem los getter and stters para poder interactuar los private 
    */
    public int getIdAutorLibro() {
        return idAutorLibro;
    }

    public void setIdAutorLibro(int idAutorLibro) {
        this.idAutorLibro = idAutorLibro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
}
