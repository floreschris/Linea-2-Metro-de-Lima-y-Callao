package com.flowired.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class GenericoController {

	@GetMapping({ "/", "/linea" })
	public String mostrarHome(Model model) {

		return "index";
	}

	@GetMapping("/estaciones")
	public String mostrarEstacion(Model model) {

		return "estaciones";
	}

	@GetMapping("/admin")
	public String mostraradmin(Model model) {

		return "admin";
	}

	@GetMapping("/form-persona")
	public String mostrarapersona(Model model) {

		return "form-persona";
	}

	@GetMapping("/estacion")
	public String mostraraestacion(Model model) {

		return "form-estacion";
	}

	@GetMapping("/tarjeta")
	public String mostrartarjeta(Model model) {

		return "form-tarjeta";
	}

	@GetMapping("/tren")
	public String mostrartren(Model model) {

		return "form-tren";
	}

	@GetMapping("/trayecto")
	public String mostrartrayecto(Model model) {

		return "form-trayecto";
	}
	
	@GetMapping("/carrito")
	public String mostrarcarrito(Model model) {

		return "carrito";
	}

}
