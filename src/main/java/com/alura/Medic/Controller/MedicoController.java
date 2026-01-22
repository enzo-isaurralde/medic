package com.alura.Medic.Controller;


import com.alura.Medic.model.DTOMedic;
import com.alura.Medic.model.Medico;
import com.alura.Medic.model.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;


    @PostMapping
    public void registrar(@RequestBody DTOMedic datos){
        repository.save(new Medico(datos));

    }

}
