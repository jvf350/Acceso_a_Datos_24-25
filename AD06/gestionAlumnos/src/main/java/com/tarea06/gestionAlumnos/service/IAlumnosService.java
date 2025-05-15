package com.tarea06.gestionAlumnos.service;

import com.tarea06.gestionAlumnos.modelo.Alumno;

import java.util.List;

// Interfaz que defibe los métodos
public interface IAlumnosService {
    List<Alumno> getAlumnos();
    void insertAlumno(Alumno alumno);
    Alumno findByNombre(String nombre);
}
