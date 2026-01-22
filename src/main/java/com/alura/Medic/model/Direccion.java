package com.alura.Medic.model;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Direccion {
    private String calle;
    private String numero;
    private String barrio;
    private String codigo_postal;
    private String ciudad;
    private String estado;

public Direccion(DTODireccion datosDireccion) {
    this.calle = datosDireccion.calle();
    this.numero = datosDireccion.numero();
    this.barrio = datosDireccion.barrio();
    this.codigo_postal = datosDireccion.codigo_postal();
    this.ciudad = datosDireccion.ciudad();
    this.estado = datosDireccion.estado();
}
}
