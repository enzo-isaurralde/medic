package com.alura.Medic.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DTODireccion(
        @NotBlank String calle,
        String numero,
        String complemento,
       @NotBlank String barrio,
       @NotBlank @Pattern(regexp = "\\d{4,8}") String codigo_postal,
       @NotBlank String ciudad,
       @NotBlank String estado) {
}
