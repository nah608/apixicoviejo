/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apixicoviejo.Servicios;

import com.example.apixicoviejo.Entidades.Usuarios;
import com.example.apixicoviejo.Repositorios.RepositorioUsuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {
    @Autowired
    RepositorioUsuario rUsuarios;
    
    public List<Usuarios> obtenerTodosLosUsuarios() {
        return rUsuarios.findAll();
    }
    
    public Optional<Usuarios> obtenerUsuario(Integer id) {
        return rUsuarios.findById(id);
    }
    
    public Optional<Usuarios> obtenerUsuarioPorNombreU(String usuario) {
        return rUsuarios.findByUsuario(usuario);
    }
    
    public boolean actualizarUsuario(Usuarios a) {
        try {
            rUsuarios.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean eliminarUsuario(Integer id) {
        try {
            rUsuarios.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean insertarUsuario(Usuarios a) {
        try {
            rUsuarios.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
