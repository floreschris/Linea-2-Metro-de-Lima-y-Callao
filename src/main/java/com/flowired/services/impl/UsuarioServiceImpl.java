package com.flowired.services.impl;

import org.springframework.stereotype.Service;

import com.flowired.modelo.Usuario;
import com.flowired.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl {

	private final IUsuarioRepository iUsuarioRepository;

	public UsuarioServiceImpl(IUsuarioRepository iUsuarioRepository) {
		this.iUsuarioRepository = iUsuarioRepository;
	}

	public Usuario registraUsuario(String login, String password, String email) {

		if (login == null || password == null) {
			return null;
		} else {

			if (iUsuarioRepository.findFirstByLogin(login).isPresent()) {
				System.out.println("Duplicate login");
				return null;
			}

			Usuario usuario = new Usuario();
			usuario.setLogin(login);
			usuario.setPassword(password);
			usuario.setEmail(email);

			return iUsuarioRepository.save(usuario);

		}

	}

	public Usuario authenticate(String login, String password) {

		return iUsuarioRepository.findByLoginAndPassword(login, password).orElse(null);

	}
}
