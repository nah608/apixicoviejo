/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.apixicoviejo.Repositorios;

import com.example.apixicoviejo.Entidades.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nahum
 */
public interface RepositorioReserva extends JpaRepository <Reservas, Integer>{
    
}
