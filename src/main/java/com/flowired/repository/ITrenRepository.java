package com.flowired.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flowired.modelo.Tren;

@Repository
public interface ITrenRepository extends JpaRepository<Tren, Integer> {

}
