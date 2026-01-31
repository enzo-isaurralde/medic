package com.alura.Medic.model;

public record DTOActualizacionMedicos(
        Long id,
        String nombre,
        String telefono,
        DTODireccion direccion
) {
}
