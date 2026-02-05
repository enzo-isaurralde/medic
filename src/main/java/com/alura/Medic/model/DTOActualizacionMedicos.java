package com.alura.Medic.model;

import jakarta.validation.constraints.NotNull;

public record DTOActualizacionMedicos(
       @NotNull Long id,
        String nombre,
        String telefono,
        DTODireccion direccion
) {
}
