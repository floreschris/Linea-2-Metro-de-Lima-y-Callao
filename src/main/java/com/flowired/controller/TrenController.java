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

import com.flowired.modelo.Tren;
import com.flowired.services.ITrenServices;

@Controller
@RequestMapping
public class TrenController {

	@Autowired
	private ITrenServices services;

	@GetMapping("/lista-tren")

	public String listarTren(Model model) {
		List<Tren> tren = services.listar();
		model.addAttribute("trenes", tren);
		return "lista-tren";
	}

	@GetMapping("/nuevo-tren")
	public String agregarTren(Model model) {
		model.addAttribute("tren", new Tren());
		return "form-tren";
	}

	@PostMapping("/guardar-tren")
	public String save(@Validated Tren t, Model model) {
		services.save(t);
		return "redirect:/lista-tren";

	}

	@GetMapping("/editar-tren/{id}")
	public String editar(@PathVariable Integer id, Model model) {
		Optional<Tren> tren = services.listarId(id);
		model.addAttribute("tren", tren);
		return "form-tren";
	}

	@GetMapping("/eliminar-tren/{id}")
	public String eliminar(@PathVariable Integer id, Model model) {
		services.delete(id);
		return "redirect:/lista-tren";
	}

}
