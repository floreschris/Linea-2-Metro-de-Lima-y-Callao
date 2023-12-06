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
@Table(name = "Tarjetas")
public class Tarjeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Tarjeta;

	@Column(name = "modelo", length = 15)
	private String modelo;

	private String foto;

	@Column(name = "codigo_Barra", length = 15)
	private String codigo_barra;

	@Column(name = "precio", length = 3)
	private double precio;

}
