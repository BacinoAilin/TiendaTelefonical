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
public class Compra {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCompra;

    private String fechaCompra;

    private String numeroCompra;

    private float totalPagar;

    private int idCliente;

    private int idCelular;


}
