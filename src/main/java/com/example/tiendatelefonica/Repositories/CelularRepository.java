package com.example.tiendatelefonica.Repositories;

import com.example.tiendatelefonica.Models.Celular;
import com.example.tiendatelefonica.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CelularRepository extends JpaRepository <Celular,String>{

    List<Celular>findCelularByCodigo(String codigo);

}




