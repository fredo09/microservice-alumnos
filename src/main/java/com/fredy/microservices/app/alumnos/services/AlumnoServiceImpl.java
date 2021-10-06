package com.fredy.microservices.app.alumnos.services;

import com.fredy.microservice.app.commons.services.CommonServiceImpl;
import com.fredy.microservices.app.alumnos.models.entity.Alumno;
import com.fredy.microservices.app.alumnos.models.repository.AlumnoRepository;
import org.springframework.stereotype.Service;


@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements  AlumnoService{
}
