package com.alura.Medic.model;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")


@Table(name="medicos")
@Entity(name="Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Boolean activo;
    private String nombre;
    private String documento;
    private String email;

    @Column(name = "telefono")
    private String telefono;


    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;

    @Embedded
    private Direccion direccion;

    public Medico(DTOMedic datos) {
        this.id = null;
        this.activo = true;
        this.nombre = datos.nombre();
        this.documento = datos.documento();
        this.email = datos.email();
        this.telefono = datos.telefono();
        this.especialidad = datos.especialidad();
        this.direccion = new Direccion(datos.direccion());

    }

    public void actualizarInformacion(@Valid DTOActualizacionMedicos datos) {
        if (datos.nombre() != null) {
            this.nombre = datos.nombre();
        }
        if (datos.telefono() != null) {
            this.telefono = datos.telefono();
        }
        if (datos.direccion() != null) {
            this.direccion.actualizarDireccion(datos.direccion());

    }
}

    public void desactivarMedico() {
        this.activo = false;
    }
}
