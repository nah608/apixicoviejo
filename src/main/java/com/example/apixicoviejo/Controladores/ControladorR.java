/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apixicoviejo.Controladores;

import com.example.apixicoviejo.Entidades.Reservas;
import com.example.apixicoviejo.Servicios.ServicioReserva;
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
@RequestMapping("/reserva")
public class ControladorR {
    @Autowired
    ServicioReserva sReservas;
    
    @GetMapping("/todos")
    public List<Reservas> obtenerTodos() {
        return sReservas.obtenerTodosLasReservas();
    }
    
    @GetMapping("/{id}")
    public Reservas obtenerReserva(@PathVariable Integer id) {
        return sReservas.obtenerReserva(id).orElse(null);
    }
    
    @PostMapping
    public List<Reservas> guardar(@RequestBody Reservas a1) {
        sReservas.insertarReserva(a1);
        return sReservas.obtenerTodosLasReservas();
    }
    
    @PutMapping
    public List<Reservas> actualizar(@RequestBody Reservas a1) {
        sReservas.actualizarReserva(a1);
        return sReservas.obtenerTodosLasReservas();
    }
    
    @DeleteMapping("/{id}")
    public List<Reservas> eliminar(@PathVariable Integer id) {
        sReservas.eliminarReserva(id);
        return sReservas.obtenerTodosLasReservas();
    }
}
