/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.apixicoviejo.Repositorios;

import com.example.apixicoviejo.Entidades.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositorioComentario extends JpaRepository <Comentarios, Integer>{
    
}
