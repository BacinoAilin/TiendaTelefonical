package com.example.tiendatelefonica.Controllers;

import com.example.tiendatelefonica.Entities.NuevoCelularRequest;
import com.example.tiendatelefonica.Entities.NuevoClienteRequest;
import com.example.tiendatelefonica.Models.Celular;
import com.example.tiendatelefonica.Models.Cliente;
import com.example.tiendatelefonica.Services.CelularService;
import com.example.tiendatelefonica.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CelularController {

    @Autowired
    private CelularService celularService;


    @PostMapping("/phone-add")
    public Celular celularCreate(@RequestBody NuevoCelularRequest nuevoCelular){
        return celularService.nuevoCelular(nuevoCelular);
    }



}
