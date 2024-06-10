/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apixicoviejo.Servicios;

import com.example.apixicoviejo.Entidades.Reservas;
import com.example.apixicoviejo.Repositorios.RepositorioReserva;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioReserva {
    @Autowired
    RepositorioReserva rReservas;
    
    public List<Reservas> obtenerTodosLasReservas() {
        return rReservas.findAll();
    }
    
    public Optional<Reservas> obtenerReserva(Integer id) {
        return rReservas.findById(id);
    }
    
    public boolean actualizarReserva(Reservas a) {
        try {
            rReservas.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean eliminarReserva(Integer id) {
        try {
            rReservas.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean insertarReserva(Reservas a) {
        try {
            rReservas.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
