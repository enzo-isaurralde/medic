package com.alura.Medic.model;

public record DTODireccion(String calle,
                           String numero,
                           String barrio,
                           String codigo_postal,
                           String ciudad,
                           String estado) {
}
