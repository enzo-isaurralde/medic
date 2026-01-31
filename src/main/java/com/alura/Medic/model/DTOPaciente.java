package com.alura.Medic.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DTOPaciente(
       @NotBlank String nombre,
       @NotBlank @Email String email,
       @NotBlank @Pattern(regexp = "\\d{10}") String telefono,
       @NotBlank @Pattern(regexp = "\\d{10}") String documento,
       @NotNull DTODireccion direccion) {
}
