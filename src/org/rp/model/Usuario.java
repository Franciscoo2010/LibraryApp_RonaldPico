/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rp.model;

import java.security.Timestamp;

/**
 *
 * @author Ronald Pico
 * @since org.rp.model.Usuario
 * @version 1.0.0
 * se crea la clase usuario 
 * se definen las variables al objeto 
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
     *se crea el objeto usuario como parametro vacio 
     */
    public Usuario() {
    }

    /**
     *se nos da los dats al parametro parametro no vacio 
     * @param id identificador unico de ususario 
     * @param username nombre del usuario 
     * @param rol aisgnacion del rol del  usuario 
     */
    public Usuario(int id, String username, String rol) {
        /** se asignan los datos de las variables 
         * 
         */
        this.id = id;
        this.username = username;
        this.rol = rol;
    }

    /**
     ** Constructor para crear un nuevo usuario en el sistema 
     * @param username nombre del usuario 
     * @param email correo del usuario 
     * @param firstName
     * @param lastName apellido del usuario 
     * @param passwordHash contraseña para ingreso del usaurio 
     * @param rol rol  e el sistema del usuario 
     */
    public Usuario(String username, String email, String firstName, String lastName,
            String passwordHash, String rol) {
          /** se asignan los datos de las variables 
         * 
         */
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.rol = rol;
    }

    /**
     * 
     * se crean los getter and stter para intrercatuar con los private 
     */

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

  
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

   
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    
    public String getRol() {
        return rol;
    }

  
    public void setRol(String rol) {
        this.rol = rol;
    }

   
    public boolean isActivo() {
        return activo;
    }

 
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

  
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    }

