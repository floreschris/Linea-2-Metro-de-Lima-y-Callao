package com.flowired.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Trenes")
public class Tren {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Tren;

	@Column(name = "num_Vagones", length = 3)
	private int nro_Vagones;

	@Column(name = "num_Asientos", length = 3)
	private int nro_Asientos;

	@Column(name = "capacidad", length = 3)
	private int capacidad;

	@Column(name = "color", length = 15)
	private String color;

}
