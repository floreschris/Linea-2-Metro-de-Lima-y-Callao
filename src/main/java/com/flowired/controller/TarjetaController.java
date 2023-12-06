package com.flowired.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flowired.modelo.Tarjeta;
import com.flowired.services.ITarjetaServices;

@Controller
@RequestMapping
public class TarjetaController {

	@Autowired
	private ITarjetaServices services;

	@GetMapping("/lista-tarjeta")

	public String listarTarjetas(Model model) {
		List<Tarjeta> tarjetas = services.listar();
		model.addAttribute("tarjetas", tarjetas);
		return "lista-tarjetas";
	}

	@GetMapping("/nuevo-tarjeta")
	public String agregarTarjeta(Model model) {
		model.addAttribute("tarjeta", new Tarjeta());
		return "form-tarjeta";
	}

	@PostMapping("/guardar-tarjeta")
	public String save(@Validated Tarjeta t, Model model) {
		services.save(t);
		return "redirect:/lista-tarjeta";

	}

	@GetMapping("/editar-tarjeta/{id}")
	public String editar(@PathVariable Integer id, Model model) {
		Optional<Tarjeta> tarjeta = services.listarId(id);
		model.addAttribute("tarjeta", tarjeta);
		return "form-tarjeta";
	}

	@GetMapping("/eliminar-tarjeta/{id}")
	public String eliminar(@PathVariable Integer id, Model model) {
		services.delete(id);
		return "redirect:/lista-tarjeta";
	}

}
