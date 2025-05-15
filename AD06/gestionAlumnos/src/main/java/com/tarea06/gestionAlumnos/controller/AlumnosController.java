package com.tarea06.gestionAlumnos.controller;

import com.tarea06.gestionAlumnos.modelo.Alumno;
import com.tarea06.gestionAlumnos.service.IAlumnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase que maneja las solicitudes relacionadas con la bd alumnos
 */
@RestController
@RequestMapping("/api/alumnos")
public class AlumnosController {

    @Autowired
    private IAlumnosService alumnosService;

    // Obtiene todos los alumnos
    @GetMapping("/alumnos")
    public List<Alumno> getAlumnos() {
        return alumnosService.getAlumnos();
    }

    //Obtiene todos los alumnos por el nombre
    @GetMapping("/{nombre}")
    public Alumno findByNombre(@PathVariable String nombre) {
        return alumnosService.findByNombre(nombre);
    }

    // Inserta un nuevo alumno en la bd
    @PostMapping("/alumno")
    public void insertAlumno(@RequestBody Alumno alumno) {
        alumnosService.insertAlumno(alumno);
    }
}
