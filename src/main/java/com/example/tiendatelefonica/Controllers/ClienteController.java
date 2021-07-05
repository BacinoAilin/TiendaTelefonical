package com.example.tiendatelefonica.Controllers;

import com.example.tiendatelefonica.Entities.NuevoClienteRequest;
import com.example.tiendatelefonica.Models.Cliente;
import com.example.tiendatelefonica.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @PostMapping("/client-create")
    public Cliente clientCreate (@RequestBody NuevoClienteRequest nuevoCliente){

        return clienteService.nuevoCliente(nuevoCliente);
    }


    @GetMapping("/client-search")
    public Cliente clientSearch(String nombre){

        return clienteService.findCliente(nombre);

    }




}
