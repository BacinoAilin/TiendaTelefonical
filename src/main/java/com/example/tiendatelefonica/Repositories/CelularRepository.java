package com.example.tiendatelefonica.Repositories;

import com.example.tiendatelefonica.Models.Celular;
import com.example.tiendatelefonica.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CelularRepository extends JpaRepository <Celular,String>{

    Celular findCelularByCodigo(String codigo);

}




