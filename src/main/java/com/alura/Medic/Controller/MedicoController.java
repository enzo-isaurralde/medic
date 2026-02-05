package com.alura.Medic.Controller;


import com.alura.Medic.model.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    @PostMapping
    public void registrar(@RequestBody @Valid DTOMedic datos){
        repository.save(new Medico(datos));

    }
    @GetMapping
    public Page<DatosListaMedico> listar(@PageableDefault(size=10,sort={"nombre"}) Pageable paginacion) {
        return repository.findAllByActivoTrue(paginacion)
                .map(DatosListaMedico::new);

    }

    @Transactional
    @PutMapping
    public void actualizar(@RequestBody @Valid DTOActualizacionMedicos datos){
        var medico = repository.getReferenceById(datos.id());
        medico.actualizarInformacion(datos);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        var medico = repository.getReferenceById(id);
        medico.desactivarMedico();
    }
}

