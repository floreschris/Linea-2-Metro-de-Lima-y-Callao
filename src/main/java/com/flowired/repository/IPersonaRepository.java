package com.flowired.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flowired.modelo.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
