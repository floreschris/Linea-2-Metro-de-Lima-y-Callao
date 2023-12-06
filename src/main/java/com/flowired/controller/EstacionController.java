package com.flowired.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

import com.flowired.modelo.Estacion;
import com.flowired.services.IEstacionServices;

@Controller
@RequestMapping
public class EstacionController {

	@Autowired
	private IEstacionServices services;

	@GetMapping("/lista-estaciones")
	public String listarEstaciones(Model model) {
		List<Estacion> estaciones = services.listar();
		model.addAttribute("estaciones", estaciones);

		return "lista-estaciones";
	}

	@GetMapping("/nuevo-estacion")
	public String agregarEstacion(Model model) {
		model.addAttribute("estacion", new Estacion());
		return "form-estacion";
	}

	@PostMapping("/guardar-estacion")
	public String save(@Validated Estacion e, Model model) {
		services.save(e);
		return "redirect:/lista-estaciones";

	}

	@GetMapping("/editar-estacion/{id}")
	public String editar(@PathVariable Integer id, Model model) {
		Optional<Estacion> estacion = services.listarId(id);
		model.addAttribute("estacion", estacion);
		return "form-estacion";
	}

	@GetMapping("/eliminar-estacion/{id}")
	public String eliminar(@PathVariable Integer id, Model model) {
		services.delete(id);
		return "redirect:/lista-estaciones";
	}

}
