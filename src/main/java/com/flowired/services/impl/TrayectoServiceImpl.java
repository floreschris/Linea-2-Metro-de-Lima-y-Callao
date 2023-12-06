package com.flowired.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowired.modelo.Trayecto;
import com.flowired.repository.ITrayectoRepository;
import com.flowired.services.ITrayectoService;

@Service
public class TrayectoServiceImpl implements ITrayectoService {

	@Autowired
	private ITrayectoRepository repo;

	@Override
	public List<Trayecto> listar() {
		// TODO Auto-generated method stub
		return (List<Trayecto>) repo.findAll();
	}

	@Override
	public Optional<Trayecto> listarId(Integer ID) {
		// TODO Auto-generated method stub
		return repo.findById(ID);
	}

	@Override
	public Integer save(Trayecto ID) {
		// TODO Auto-generated method stub
		int res = 0;

		Trayecto trayecto = repo.save(ID);
		if (!trayecto.equals(null)) {
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
