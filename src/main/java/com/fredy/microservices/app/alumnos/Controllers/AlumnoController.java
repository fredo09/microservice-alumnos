package com.fredy.microservices.app.alumnos.Controllers;

import com.fredy.microservice.app.commons.controllers.CommonController;
import com.fredy.microservices.app.alumnos.models.entity.Alumno;
import com.fredy.microservices.app.alumnos.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService > {

    @PutMapping("/{id}")
    public ResponseEntity<?> editar (@RequestBody Alumno alumno, @PathVariable Long id){
        Optional<Alumno> o = service.findById(id);

        if (!o.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Alumno alumnoDB = o.get();

        alumnoDB.setNombre(alumno.getNombre());
        alumnoDB.setApellido(alumno.getApellido());
        alumnoDB.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDB));
    }

}