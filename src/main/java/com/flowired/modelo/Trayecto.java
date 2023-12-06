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
@Table(name = "Trayectos")
public class Trayecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Taryecto;

	@Column(name = "estacion_Inicio", length = 50)
	private String est_Inicio;

	@Column(name = "estacion_final", length = 50)
	private String est_Final;

}
