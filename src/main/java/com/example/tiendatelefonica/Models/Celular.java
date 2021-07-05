package com.example.tiendatelefonica.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Celular {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCelular;

    private String marca;
    private String modelo;
    private float precio;
    private String codigo;

    private Boolean vendido;

}
