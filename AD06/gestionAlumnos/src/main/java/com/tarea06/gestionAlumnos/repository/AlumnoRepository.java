package com.tarea06.gestionAlumnos.repository;


import com.tarea06.gestionAlumnos.modelo.Alumno;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

// Los métodos CRUD se heredan de MongoRepository (CRUDRepository),
// por lo que solamente hace falta definir aquellos método que
// no sean de este tipo.
public interface AlumnoRepository extends MongoRepository<Alumno, String> {

    //Busca alumnos por nombre
    List<Alumno> findByNombre(String nombre);
}
