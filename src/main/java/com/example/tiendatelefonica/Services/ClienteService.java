package com.example.tiendatelefonica.Services;

import com.example.tiendatelefonica.Entities.NuevoClienteRequest;
import com.example.tiendatelefonica.Models.Cliente;
import com.example.tiendatelefonica.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente nuevoCliente(NuevoClienteRequest nuevoCliente){


        return clienteRepository.save(Cliente.builder()
            .nombre(nuevoCliente.getNombre())
            .apellido(nuevoCliente.getApellido())
            .telefono(nuevoCliente.getTelefono())
            .dni(nuevoCliente.getDni())
            .direccion(nuevoCliente.getDireccion())
            .build());

    }

    public Cliente findCliente(String nombre) {
        Cliente cliente = clienteRepository.findClienteByNombre(nombre);

        System.out.println(cliente.toString());
        return cliente;
    }

}
