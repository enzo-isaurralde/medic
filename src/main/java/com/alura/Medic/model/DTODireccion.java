package com.alura.Medic.model;

public record DTODireccion(String calle,
                           String numero,
                           String complemento,
                           String barrio,
                           String codigo_postal,
                           String ciudad) {
}
