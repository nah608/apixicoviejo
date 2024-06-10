/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apixicoviejo.Servicios;

import com.example.apixicoviejo.Entidades.Productos;
import com.example.apixicoviejo.Repositorios.RepositorioProductos;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioProducto {
    @Autowired
    RepositorioProductos rProductos;
    
    public List<Productos> obtenerTodosLosProductos() {
        return rProductos.findAll();
    }
    
    public Optional<Productos> obtenerProducto(Integer id) {
        return rProductos.findById(id);
    }
    
    public List<Productos> obtenerProductosPorTipo(String tipo) {
    return rProductos.findByTipo(tipo);
}
    
    public boolean actualizarProducto(Productos a) {
        try {
            rProductos.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean eliminarProducto(Integer id) {
        try {
            rProductos.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean insertarProducto(Productos a) {
        try {
            rProductos.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
