package com.sistemaLibreriaWebSpring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.sistemaLibreriaWebSpring.entity.Sucursal;
import com.sistemaLibreriaWebSpring.repository.SucursalRepository;

@Controller
@RequestMapping("/sucursal")
public class SucursalController {

	@Autowired
	SucursalRepository sucursalRepository;



	@RequestMapping("/buscarxNombre")
	public String buscarxNombre(HttpServletRequest request, @RequestParam(value="nombre") String nombre, Model model) {
		List<Sucursal> listaSucursales = sucursalRepository.findByNombreContains(nombre);
		model.addAttribute("listaSucursales", listaSucursales);
		return "gestionSucursal";
	}





	@GetMapping("/gestionarSucursar")
	public String gestionar(HttpServletRequest request) {

		return "gestionSucursal";
	}

	@PostMapping("/nuevoSucursal")
	public String nuevoSucursal(HttpServletRequest request,Model model) {
		Sucursal objSucursal = new Sucursal();
		model.addAttribute("objSucursal", objSucursal);
		return "nuevoSucursal";
	}

	@PostMapping("/grabar")
	public String grabar(HttpServletRequest request, Sucursal objSucursal, Model model) {
		Sucursal objSucursalBD = sucursalRepository.findByNombre(objSucursal.getNombre());
		if (objSucursalBD == null) {
			model.addAttribute("mensaje", "la sucursal ha sido registrado con éxito");
			sucursalRepository.save(objSucursal);
			Sucursal objSucursalNuevo = new Sucursal();
			model.addAttribute("objSucursal", objSucursalNuevo);
		}
		else {
			model.addAttribute("mensaje", "la sucursal  ya se encuentra registrado en el sistema");
			model.addAttribute("objSucursal", objSucursal);
		}
		return "nuevoSucursal";
	}

	@Transactional
	@GetMapping("/eliminar/{codigo}")
	public String eliminar(HttpServletRequest request, @PathVariable("codigo") int codigo, Model model) {
		sucursalRepository.deleteByCodigo(codigo);
		model.addAttribute("mensaje", "La sucursal  ha sido eliminado");
		return "gestionSucursal";
	}

	@GetMapping("/editar/{codigo}")
	public String editar(HttpServletRequest request, @PathVariable("codigo") int codigo, Model model) {
		Sucursal objSucursal = sucursalRepository.findByCodigo(codigo);
		model.addAttribute("objSucursal", objSucursal);
		return "editarSucursal";
	}

	@PostMapping("/actualizar")
	public String actualizar(HttpServletRequest request,Sucursal objSucursal, Model model) {
		sucursalRepository.save(objSucursal);
		return "gestionSucursal";
	}

}
