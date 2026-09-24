
package org.rp.model;

import java.security.Timestamp;

/**
 * se crea la clase Usuario se definen  los atributos 
 * @author Ronald Pico
 * @version 1.0.0
 * @see org.rp.model.Usuario
 */
public class Usuario {
    
    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String passwordHash;
    private String rol;
    private boolean activo;
    private Timestamp fechaCreacion;

    /**
     * Constructor vacio se crea el objeto usuario
     */
    public Usuario() {
    }

    /**
     *  objeto Usuario con todos sus datos.
     *  
     * @param id identificador unico de ususario 
     * @param username nombre del usuario 
     * @param rol aisgnacion del rol del  usuario 
     */
    public Usuario(int id, String username, String rol) {
        this.id = id;
        this.username = username;
        this.rol = rol;
    }

    /**
     *  objeto Usuario con todos sus datos.
     *  
     * @param username nombre del usuario 
     * @param email correo del usuario 
     * @param firstName nombre del usuario
     * @param lastName apellido del usuario 
     * @param passwordHash contraseña para ingreso del usaurio 
     * @param rol rol  e el sistema del usuario 
     */
    public Usuario(String username, String email, String firstName, String lastName,
            String passwordHash, String rol) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.rol = rol;
    }

    /**
     Id id nos decuelve el ID
     * @return nosdevuelve el id del usuario 
     */
    public int getId() {
        return id;
    }

    /**
     definine id
     * @param id es el identificador unico del usuario 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     autor nos decuelve el nombre de usuario
     * @return  regresa el nombre de usuario 
     */
    public String getUsername() {
        return username;
    }

    /**
     establece username
     * @param username nombre del usuario 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     nos devuelve el correo electronico del usuario 
     * @return      nos devuelve el correo del usuario 
     */
    public String getEmail() {
        return email;
    }

    /**
     establece o actualiza el correo electronico del usuario 
     * @param email      establece o actualiza el correo del usuario 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     nos devuelve el nombre del usuario 
     * @return      nos devuelve el nombre del usuario 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     establece o actualiza el nombre del usuario 
     * @param firstName      establece o actualiza el nombre del usuario 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     nos regresa el apellido del usuario
     * @return nos devuelve el apellido del usuario 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     define apellido del usuario 
     * @param lastName apellido del usuario 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     nos devuelve el password hash del usuario 
     * @return      nos devuelve la contraseña para ingreso del usaurio 
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     establece o actualiza el password hash del usuario 
     * @param passwordHash      establece o actualiza la contraseña para ingreso del usaurio 
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     autor nos regresa el rol del usuario 
     * @return      autor nos regresa el rol  e el sistema del usuario 
     */
    public String getRol() {
        return rol;
    }

    /**
     establece o actualiza el rol del usuario 
     * @param rol      establece o actualiza el rol  e el sistema del usuario 
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     autor nos regresa si esta activo 
     * @return      autor nos regresa si el usuario esta activo 
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     establece o actualiza si esta activo 
     * @param activo      establece o actualiza si el usuario esta activo 
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     autor nos regresa la fecha de creacion 
     * @return      autor nos regresa la fecha de creacion 
     */
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     establece o actualiza la fecha de creacion 
     * @param fechaCreacion      establece o actualiza la fecha de creacion 
     */
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}