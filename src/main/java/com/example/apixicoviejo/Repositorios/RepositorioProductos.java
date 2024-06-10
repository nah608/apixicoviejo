/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.apixicoviejo.Repositorios;

import com.example.apixicoviejo.Entidades.Productos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nahum
 */
@Repository
public interface RepositorioProductos extends JpaRepository<Productos, Integer> {
    List<Productos> findByTipo(String tipo);
}
