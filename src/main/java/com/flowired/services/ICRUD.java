package com.flowired.services;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T, ID> {

	public List<T> listar();

	public Optional<T> listarId(Integer ID);

	public Integer save(T t);

	public void delete(Integer ID);

}
