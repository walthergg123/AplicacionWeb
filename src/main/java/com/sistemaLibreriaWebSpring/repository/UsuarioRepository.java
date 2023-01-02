package com.sistemaLibreriaWebSpring.repository;

import com.sistemaLibreriaWebSpring.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
	Usuario findByCorreo(String correo);
	Usuario findByCorreoAndPassword(String correo, String password);
}
