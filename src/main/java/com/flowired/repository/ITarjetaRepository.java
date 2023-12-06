package com.flowired.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flowired.modelo.Tarjeta;

@Repository
public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer> {

}
