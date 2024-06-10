/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apixicoviejo.Servicios;

import com.example.apixicoviejo.Entidades.Comentarios;
import com.example.apixicoviejo.Repositorios.RepositorioComentario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioComentario {
    @Autowired
    RepositorioComentario rComentarios;
    
    public List<Comentarios> obtenerTodosLosComentarios() {
        return rComentarios.findAll();
    }
    
    public boolean eliminarComentario(Integer id) {
        try {
            rComentarios.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean insertarComentario(Comentarios a) {
        try {
            rComentarios.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
