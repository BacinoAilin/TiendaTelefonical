package com.example.tiendatelefonica.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NuevoClienteRequest {

    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private String telefono;
}
