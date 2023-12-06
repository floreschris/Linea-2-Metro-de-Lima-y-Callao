package com.flowired.controller;

import com.flowired.modelo.Usuario;
import com.flowired.services.impl.UsuarioServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    private final UsuarioServiceImpl usuarioServiceImpl;


    public UsuarioController(UsuarioServiceImpl usuarioServiceImpl) {
        this.usuarioServiceImpl = usuarioServiceImpl;
    }

    @GetMapping("/registro")
    public String getRegisterPage(Model model) {
        model.addAttribute("registerRequest", new Usuario());
        return "registro";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginRequest", new Usuario());
        return "login";

    }
    
    @PostMapping("/registro")
    public String register(@ModelAttribute Usuario usuario) {
        System.out.println("Register request: " + usuario);
        Usuario registeredUser = usuarioServiceImpl.registraUsuario(usuario.getLogin(), usuario.getPassword(),
                usuario.getEmail());
        return registeredUser == null ? "error" : "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Usuario usuario, Model model) {
        System.out.println("Login request: " + usuario);
        Usuario authenticated = usuarioServiceImpl.authenticate(usuario.getLogin(), usuario.getPassword());

        if (authenticated != null) {
            model.addAttribute("userLogin", authenticated.getLogin());
            return "admin";
        } else {
            return "error";
        }
    }

}