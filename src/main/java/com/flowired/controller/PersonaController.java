package com.flowired.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flowired.modelo.Persona;
import com.flowired.services.IPersonaServices;

import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

@Controller
@RequestMapping
public class PersonaController {

	@Autowired
	private IPersonaServices services;

	@GetMapping("/lista-persona")

	public String listarPersonas(Model model) {
		List<Persona> personas = services.listar();
		model.addAttribute("personas", personas);
		return "lista-persona";
	}

	@GetMapping("/nuevo-persona")
	public String agregarPersona(Model model) {
		model.addAttribute("persona", new Persona());
		return "form-persona";
	}

	@PostMapping("/guardar-persona")
	public String save(@Validated Persona p, Model model) {
		services.save(p);
		return "redirect:/lista-persona";

	}

	@GetMapping("/editar-persona/{id}")
	public String editar(@PathVariable Integer id, Model model) {
		Optional<Persona> persona = services.listarId(id);
		model.addAttribute("persona", persona);
		return "form-persona";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id, Model model) {
		services.delete(id);
		return "redirect:/lista-persona";
	}


}
