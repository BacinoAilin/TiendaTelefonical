package com.example.tiendatelefonica.Repositories;

import com.example.tiendatelefonica.Models.Cliente;
import com.example.tiendatelefonica.Models.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra,String>{

    Compra findCompraByIdCliente(int idCliente);

}



