package com.example.tiendatelefonica.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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

    /*
    @ManyToOne
    @JoinColumn(name = "idCompra",
    referencedColumnName = "idCompra")
    private Compra compraguardada;
    */

    @OneToMany(mappedBy = "Celular")
    private List<Compra> comprasguardadas;

}

