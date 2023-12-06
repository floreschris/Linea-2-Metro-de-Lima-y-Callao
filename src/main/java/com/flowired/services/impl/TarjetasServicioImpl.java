package com.flowired.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowired.modelo.Tarjeta;
import com.flowired.repository.ITarjetaRepository;
import com.flowired.services.ITarjetaServices;

@Service
public class TarjetasServicioImpl implements ITarjetaServices {

	@Autowired
	private ITarjetaRepository repo;

	@Override
	public List<Tarjeta> listar() {
		// TODO Auto-generated method stub
		return (List<Tarjeta>) repo.findAll();
	}

	@Override
	public Optional<Tarjeta> listarId(Integer ID) {
		// TODO Auto-generated method stub
		return repo.findById(ID);
	}

	@Override
	public Integer save(Tarjeta ID) {
		// TODO Auto-generated method stub
		int res = 0;

		Tarjeta tarjeta = repo.save(ID);
		if (!tarjeta.equals(null)) {
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
