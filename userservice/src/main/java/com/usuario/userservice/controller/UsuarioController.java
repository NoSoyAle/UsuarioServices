package com.usuario.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.usuario.userservice.service.UsuarioService;
import com.usuario.userservice.model.Usuario;




@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioService usuarioService;

  @GetMapping
  public List<Usuario> listarUsuario(){
    return usuarioService.listarUsuario();
  }

  @PostMapping
  public Usuario crearUsuario(@RequestBody Usuario usuario) {      
      return usuarioService.crearUser(usuario);
  }

  @GetMapping("/{id}")
  public Usuario buscarUsuario(@PathVariable Long id){
    return usuarioService.buscarUser(id);
  }

  @DeleteMapping("/{id}")
  public void eliminarUsuario(@PathVariable Long id){
    usuarioService.eliminarUsuario(id);
  }

}
