package com.flowired.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flowired.modelo.Trayecto;

@Repository
public interface ITrayectoRepository extends JpaRepository<Trayecto, Integer>{

}
