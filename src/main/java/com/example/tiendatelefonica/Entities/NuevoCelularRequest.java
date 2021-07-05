package com.example.tiendatelefonica.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NuevoCelularRequest {


    private int idCelular;

    private String marca;
    private String modelo;
    private float precio;
    private String codigo;

    private Boolean vendido;
}
