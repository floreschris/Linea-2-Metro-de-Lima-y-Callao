package com.flowired.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowired.modelo.Estacion;
import com.flowired.repository.IEstacionRepository;
import com.flowired.services.IEstacionServices;

@Service
public class EstacionServicesImpl implements IEstacionServices {

	@Autowired
	private IEstacionRepository repo;

	@Override
	public List<Estacion> listar() {
		// TODO Auto-generated method stub
		return (List<Estacion>) repo.findAll();
	}

	public Optional<Estacion> listarId(Integer ID) {
		// TODO Auto-generated method stub
		return repo.findById(ID);
	}

	@Override
	public Integer save(Estacion ID) {
		// TODO Auto-generated method stub
		int res = 0;
		Estacion estacion = repo.save(ID);
		if (!estacion.equals(null)) {
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
