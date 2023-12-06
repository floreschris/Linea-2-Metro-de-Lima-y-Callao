package com.flowired.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowired.modelo.Persona;
import com.flowired.repository.IPersonaRepository;
import com.flowired.services.IPersonaServices;

@Service
public class PersonaServicesImpl implements IPersonaServices {

	@Autowired
	private IPersonaRepository repo;

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>) repo.findAll();
	}

	@Override
	public Optional<Persona> listarId(Integer ID) {
		// TODO Auto-generated method stub
		return repo.findById(ID);
	}

	@Override
	public Integer save(Persona ID) {
		// TODO Auto-generated method stub
		int res = 0;

		Persona persona = repo.save(ID);

		if (!persona.equals(null)) {
			res = 1;
		}

		return res;
	}

	@Override
	public void delete(Integer ID) {
		// TODO Auto-generated method stub
		repo.deleteById(ID);
	}

}
