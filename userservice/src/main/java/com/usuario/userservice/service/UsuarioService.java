package com.usuario.userservice.service;
import com.usuario.userservice.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> listarUsuario();

    Usuario crearUser (Usuario usuario);

    Usuario buscarUser(Long id);

    void eliminarUsuario(Long id);


}
