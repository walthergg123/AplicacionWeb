package com.sistemaLibreriaWebSpring.controller;


import com.sistemaLibreriaWebSpring.entity.Usuario;
import com.sistemaLibreriaWebSpring.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	

	

	

	
	@RequestMapping("/validarUsuario")
	public String validarUsuario(HttpServletRequest request, @RequestParam(value="correo") String correo, @RequestParam(value="password") String password, Model model) {
		Usuario objUsuarioBD = usuarioRepository.findByCorreoAndPassword(correo, password);
		if (objUsuarioBD!=null) {
			return "principal";
		}
		else {
			model.addAttribute("mensaje", "El usuario y/o contraseña no es correcto");
			return "index";
		}
	}
}
