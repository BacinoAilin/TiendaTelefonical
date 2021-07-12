package com.example.tiendatelefonica.Services;

import com.example.tiendatelefonica.Entities.NuevoCelularRequest;
import com.example.tiendatelefonica.Entities.NuevoClienteRequest;
import com.example.tiendatelefonica.Models.Celular;
import com.example.tiendatelefonica.Models.Cliente;
import com.example.tiendatelefonica.Models.Compra;
import com.example.tiendatelefonica.Repositories.CelularRepository;
import com.example.tiendatelefonica.Repositories.ClienteRepository;
import com.example.tiendatelefonica.Repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CelularService {

    @Autowired
    private CelularRepository celularRepository;
    private CompraService compraService;

    public Celular nuevoCelular(NuevoCelularRequest nuevoCelular){



        //Compra compra = compraService.findCompra(String numeroCompra);

        return celularRepository.save(Celular.builder()

                .codigo(nuevoCelular.getCodigo())
                .marca(nuevoCelular.getMarca())
                .modelo(nuevoCelular.getModelo())
                .precio(nuevoCelular.getPrecio())
                .vendido(nuevoCelular.getVendido())



        .build());

    }
}



