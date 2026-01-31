package com.alura.Medic.Controller;

import com.alura.Medic.model.DTOPaciente;
import com.alura.Medic.model.Paciente;
import com.alura.Medic.model.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @Transactional
    @PostMapping
    public void registrar(@RequestBody @Valid DTOPaciente datos){
        repository.save(new Paciente(datos));
    }

}
