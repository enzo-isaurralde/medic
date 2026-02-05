package com.alura.Medic.model;

public record DatosDetalleMedico(
        Long id,
        String nombre,
        String email,
        String documento,
        String telefono,
        Especialidad especialidad,
        DTODireccion direccion) {
    public DatosDetalleMedico(Medico medico) {
        this(
                medico.getId(),
                medico.getNombre(),
                medico.getEmail(),
                medico.getDocumento(),
                medico.getTelefono(),
                medico.getEspecialidad(),
                new DTODireccion(
                        medico.getDireccion().getCalle(),
                        medico.getDireccion().getNumero(),
                        medico.getDireccion().getEstado(),
                        medico.getDireccion().getBarrio(),
                        medico.getDireccion().getCodigo_postal(),
                        medico.getDireccion().getCiudad(),
                        medico.getDireccion().getEstado()
                )
        );
    }

}
