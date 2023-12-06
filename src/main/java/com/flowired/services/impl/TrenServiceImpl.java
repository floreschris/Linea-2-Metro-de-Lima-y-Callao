package com.flowired.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowired.modelo.Tren;
import com.flowired.repository.ITrenRepository;
import com.flowired.services.ITrenServices;

@Service
public class TrenServiceImpl implements ITrenServices {

	@Autowired
	private ITrenRepository repo;

	@Override
	public List<Tren> listar() {
		// TODO Auto-generated method stub
		return (List<Tren>) repo.findAll();
	}

	@Override
	public Optional<Tren> listarId(Integer ID) {
		// TODO Auto-generated method stub
		return repo.findById(ID);
	}

	@Override
	public Integer save(Tren ID) {
		// TODO Auto-generated method stub
		int res = 0;

		Tren tren = repo.save(ID);
		if (!tren.equals(null)) {
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
