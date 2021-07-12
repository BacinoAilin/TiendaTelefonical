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
public class Compra {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCompra;

    private String fechaCompra;

    private String numeroCompra;

    private float totalPagar;

    @OneToOne
    private Cliente cliente;

    @OneToMany (mappedBy = "Compra")
    private List<Celular> celulares;


}
