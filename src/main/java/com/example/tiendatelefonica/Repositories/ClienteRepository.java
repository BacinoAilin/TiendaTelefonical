package com.example.tiendatelefonica.Repositories;

import com.example.tiendatelefonica.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,String> {


    Cliente findClienteByNombre(String nombre);

}
