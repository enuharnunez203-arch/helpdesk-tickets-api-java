/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tickets_api;

/**
 *
 * @author enuhar
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios") 
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository; // Conectamos la base de datos aquí
    
    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    // Método POST: Crear un nuevo usuario 
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario nuevoUsuario) {
        return usuarioRepository.save(nuevoUsuario);
    }
    
}
