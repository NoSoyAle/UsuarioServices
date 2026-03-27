package com.usuario.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.usuario.userservice.model.*;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
