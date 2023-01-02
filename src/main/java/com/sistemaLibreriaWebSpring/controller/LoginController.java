package com.sistemaLibreriaWebSpring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class LoginController {
	
			@GetMapping("/mostrarRecuperarContrasenha")
			public String mostrarRecuperarContrasenha(HttpServletRequest request) {
				return "recuperarContrasenha";
			}
	
	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		return "gestionSucursal";
	}
	
	@GetMapping("/principal")
	public String principal(HttpServletRequest request) {
		return "principal";
	}
	
}
