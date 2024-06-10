/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apixicoviejo.Controladores;

import com.example.apixicoviejo.Entidades.Comentarios;
import com.example.apixicoviejo.Entidades.Reservas;
import com.example.apixicoviejo.Servicios.ServicioComentario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentario")
public class ControladorC {
    @Autowired
    ServicioComentario sComentarios;
    
    @GetMapping("/todos")
    public List<Comentarios> obtenerTodos() {
        return sComentarios.obtenerTodosLosComentarios();
    }
    
    @PostMapping
    public List<Comentarios> guardar(@RequestBody Comentarios a1) {
        sComentarios.insertarComentario(a1);
        return sComentarios.obtenerTodosLosComentarios();
    }
    
    @DeleteMapping("/{id}")
    public List<Comentarios> eliminar(@PathVariable Integer id) {
        sComentarios.eliminarComentario(id);
        return sComentarios.obtenerTodosLosComentarios();
    }
}
