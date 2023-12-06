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

import com.flowired.modelo.Trayecto;
import com.flowired.services.ITrayectoService;

@Controller
@RequestMapping
public class TrayectoController {

	@Autowired
	private ITrayectoService services;

	@GetMapping("/lista-trayecto")

	public String listarTrayecto(Model model) {
		List<Trayecto> trayecto = services.listar();
		model.addAttribute("trayectos", trayecto);
		return "lista-trayecto";
	}

	@GetMapping("/nuevo-trayecto")
	public String agregarTrayecto(Model model) {
		model.addAttribute("trayecto", new Trayecto());
		return "form-trayecto";
	}

	@PostMapping("/guardar-trayecto")
	public String save(@Validated Trayecto t, Model model) {
		services.save(t);
		return "redirect:/lista-trayecto";

	}

	@GetMapping("/editar-trayecto/{id}")
	public String editar(@PathVariable Integer id, Model model) {
		Optional<Trayecto> trayecto = services.listarId(id);
		model.addAttribute("trayecto", trayecto);
		return "form-trayecto";
	}

	@GetMapping("/eliminar-trayecto/{id}")
	public String eliminar(@PathVariable Integer id, Model model) {
		services.delete(id);
		return "redirect:/lista-trayecto";
	}

}
