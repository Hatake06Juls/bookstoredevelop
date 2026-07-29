package com.bookstoredevelop.bookstoredevelop.controller;

import com.bookstoredevelop.bookstoredevelop.model.Usuarios;
import com.bookstoredevelop.bookstoredevelop.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController
{
    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping
    public List<Usuarios> getALL()
    {
        return usuariosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuarios getById(@PathVariable Long id)
    {
        return usuariosRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Usuarios create(@RequestBody Usuarios usuarios)
    {
        return usuariosRepository.save(usuarios);
    }

    @PutMapping("/{id}")
    public Usuarios update(@PathVariable Long id, @RequestBody Usuarios usuarios)
    {
        usuarios.setId_usuario(id);
        return usuariosRepository.save(usuarios);
    }

    @DeleteMapping("/{id}")
    public void deldete(@PathVariable Long id)
    {
        usuariosRepository.deleteById(id);
    }
}