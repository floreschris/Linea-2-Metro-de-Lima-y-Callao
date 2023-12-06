package com.flowired.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flowired.modelo.Estacion;

@Repository
public interface IEstacionRepository extends JpaRepository<Estacion, Integer> {

}
