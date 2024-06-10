/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apixicoviejo.Controladores;

import com.example.apixicoviejo.Entidades.Usuarios;
import com.example.apixicoviejo.Servicios.ServicioUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class ControladorU {
    @Autowired
    ServicioUsuario sUsuarios;
    
    @GetMapping("/todos")
    public List<Usuarios> obtenerTodos() {
        return sUsuarios.obtenerTodosLosUsuarios();
    }
    
    @GetMapping("/{id}")
    public Usuarios obtenerUsuario(@PathVariable Integer id) {
        return sUsuarios.obtenerUsuario(id).orElse(null);
    }
    
    @GetMapping("/usuario")
    public Usuarios obtenerUsuarioPorNombreU(@RequestParam String usuario) {
        return sUsuarios.obtenerUsuarioPorNombreU(usuario).orElse(null);
    }
    
    @PostMapping
    public List<Usuarios> guardar(@RequestBody Usuarios a1) {
        sUsuarios.insertarUsuario(a1);
        return sUsuarios.obtenerTodosLosUsuarios();
    }
    
    @PutMapping
    public List<Usuarios> actualizar(@RequestBody Usuarios a1) {
        sUsuarios.actualizarUsuario(a1);
        return sUsuarios.obtenerTodosLosUsuarios();
    }
    
    @DeleteMapping("/{id}")
    public List<Usuarios> eliminar(@PathVariable Integer id) {
        sUsuarios.eliminarUsuario(id);
        return sUsuarios.obtenerTodosLosUsuarios();
    }
}
