package com.example.examen_springboot_miguel_munoz.repository;

import com.example.examen_springboot_miguel_munoz.model.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepo extends CrudRepository<Alumno, Long> {

}
