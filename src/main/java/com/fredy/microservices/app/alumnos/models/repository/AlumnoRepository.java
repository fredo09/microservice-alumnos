package com.fredy.microservices.app.alumnos.models.repository;

import com.fredy.microservices.app.alumnos.models.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository <Alumno, Long>{
}
