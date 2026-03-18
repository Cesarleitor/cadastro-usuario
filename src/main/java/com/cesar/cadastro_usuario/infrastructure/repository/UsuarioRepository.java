package com.cesar.cadastro_usuario.infrastructure.repository;

import com.cesar.cadastro_usuario.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    void deleteByEmail(String email);

}
