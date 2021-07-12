package com.example.tiendatelefonica.Controllers;


import com.example.tiendatelefonica.Entities.NuevaCompraRequest;
import com.example.tiendatelefonica.Entities.NuevoClienteRequest;
import com.example.tiendatelefonica.Models.Cliente;
import com.example.tiendatelefonica.Models.Compra;
import com.example.tiendatelefonica.Services.ClienteService;
import com.example.tiendatelefonica.Services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CompraController {


    @Autowired
    private CompraService compraService;

    @PostMapping("/new-sell")
    public Compra clientCreate(@RequestBody NuevaCompraRequest nuevaCompra){

        return compraService.nuevaCompra((nuevaCompra));
    }


    @GetMapping ("/shop-search-byClient")
        public Compra compraSearch(int idCliente){
            return compraService.findCompra(idCliente);
        }

    @GetMapping("/shop-search-byOrderNumer")
        public Compra compraSearch(String numeroCompra) {return compraService.findCompra(numeroCompra); }
}



