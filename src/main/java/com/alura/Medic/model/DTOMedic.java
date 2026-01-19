package com.alura.Medic.model;

public record DTOMedic(String nombre,
                       String email,
                       String documento,
                       Especialidad especialidad,
                       DTODireccion direccion) {
}
