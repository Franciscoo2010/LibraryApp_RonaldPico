
package org.rp.model;

/**
 * se crea la clase AutorLibro se asignan los atributos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.AutorLibro
 */
public class AutorLibro {
    private int idAutorLibro;
    private int idAutor;
    private String isbn;
    
    /**
     * Constructor vacio se crea el objeto autor libro
     */
    public AutorLibro(){
    
    }

    /**
     *  objeto AutorLibro con todos sus datos.
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

    /**
     Id autor libro nos decuelve el ID
     * @return nosdevuelve el id del autor libro 
     */
    public int getIdAutorLibro() {
        return idAutorLibro;
    }

    /**
     definine idAutorLibro
     * @param idAutorLibro es el identificador unico del autor libro 
     */
    public void setIdAutorLibro(int idAutorLibro) {
        this.idAutorLibro = idAutorLibro;
    }

    /**
     autor nos decuelve el id del autor
     * @return  regresa el id del autor 
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     establece idAutor
     * @param idAutor id del autor 
     */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
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
     * @param isbn codigo unico 
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}