package com.tarea06.gestionAlumnos.modelo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Clase de modelo que representa a un Alumno.
 * Está mapeada a la colección alumnos de MongoDB.
 */
@Document(collection = "alumnos2")
public class Alumno {

    @Id
    private String id;

    @Field
    private String nombre;
    @Field
    private String apellidos;
    @Field
    private String email;

    // Constructor vacío requerido por spring
    public Alumno() {}


    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
