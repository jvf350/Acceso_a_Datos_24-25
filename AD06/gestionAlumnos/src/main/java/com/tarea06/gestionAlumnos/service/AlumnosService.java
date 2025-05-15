package com.tarea06.gestionAlumnos.service;


import com.tarea06.gestionAlumnos.modelo.Alumno;
import com.tarea06.gestionAlumnos.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Implementa de IAlumnosService
// Contiene la logica relacionada con alumnos
@Service
public class AlumnosService implements IAlumnosService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    // Obtiene todos los alumnos
    @Override
    public List<Alumno> getAlumnos() {
        return alumnoRepository.findAll();
    }

    // Inserta un nuevo alumno en la bd
    @Override
    public void insertAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
    }

    //Obtiene el primer alumno que coincida con el nombre o null si no existe
    @Override
    public Alumno findByNombre(String nombre) {
        return alumnoRepository.findByNombre(nombre).stream().findFirst().orElse(null);
    }
}
