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
@Table(name = "Estaciones")
public class Estacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Estacion;

	@Column(name = "nombre_Estacion", length = 30)
	private String nombre;

	@Column(name = "distrito", length = 50)
	private String distrito;

	@Column(name = "referencia_Estacion", length = 50)
	private String referencia;

	@Column(name = "tipo_de_Estacion", length = 50)
	private String tipo_Estacion;

}
