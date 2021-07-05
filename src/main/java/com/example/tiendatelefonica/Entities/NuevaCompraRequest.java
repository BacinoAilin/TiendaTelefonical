package com.example.tiendatelefonica.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NuevaCompraRequest {

    private int idCompra;

    private String fechaCompra;

    private String numeroCompra;

    private float totalPagar;

    private int idCliente;

    private int idCelular;
}
