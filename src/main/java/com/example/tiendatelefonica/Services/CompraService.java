package com.example.tiendatelefonica.Services;

import com.example.tiendatelefonica.Controllers.CelularController;
import com.example.tiendatelefonica.Entities.NuevaCompraRequest;
import com.example.tiendatelefonica.Entities.NuevoClienteRequest;
import com.example.tiendatelefonica.Models.Celular;
import com.example.tiendatelefonica.Models.Cliente;
import com.example.tiendatelefonica.Models.Compra;
import com.example.tiendatelefonica.Repositories.CelularRepository;
import com.example.tiendatelefonica.Repositories.ClienteRepository;
import com.example.tiendatelefonica.Repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;



    public Compra nuevaCompra(NuevaCompraRequest nuevaCompra){


        return compraRepository.save(Compra.builder()
                .fechaCompra(nuevaCompra.getFechaCompra())
                .numeroCompra(nuevaCompra.getNumeroCompra())
                .celulares(nuevaCompra)
                .cliente(nuevaCompra.getIdCliente())
                .totalPagar(nuevaCompra.getTotalPagar())
                .build());

    }

    public Compra findCompra(int idCliente)
    {
        Compra compra = compraRepository.findCompraByIdCliente(idCliente);
        System.out.println(compra.toString());
        return compra;

    }

    public Compra findCompra(String numeroCompra)
    {
        Compra compra = compraRepository.findCompraByNumeroCompra(numeroCompra);
        return compra;
    }


}




