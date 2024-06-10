/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apixicoviejo.Controladores;

import com.example.apixicoviejo.Entidades.Productos;
import com.example.apixicoviejo.Servicios.ServicioProducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ControladorP {
    @Autowired
    ServicioProducto sProductos;
    
    @GetMapping("/todos")
    public List<Productos> obtenerTodos() {
        return sProductos.obtenerTodosLosProductos();
    }
    
    @GetMapping("/{id}")
    public Productos obtenerProducto(@PathVariable Integer id) {
        return sProductos.obtenerProducto(id).orElse(null);
    }
    
    @GetMapping("/tipo/{tipo}")
    public List<Productos> obtenerPorTipo(@PathVariable String tipo) {
    return sProductos.obtenerProductosPorTipo(tipo);
    }
    
    @PostMapping
    public List<Productos> guardar(@RequestBody Productos a1) {
        sProductos.insertarProducto(a1);
        return sProductos.obtenerTodosLosProductos();
    }
    
    @PutMapping
    public List<Productos> actualizar(@RequestBody Productos a1) {
        sProductos.actualizarProducto(a1);
        return sProductos.obtenerTodosLosProductos();
    }
    
    @DeleteMapping("/{id}")
    public List<Productos> eliminar(@PathVariable Integer id) {
        sProductos.eliminarProducto(id);
        return sProductos.obtenerTodosLosProductos();
    }
}
