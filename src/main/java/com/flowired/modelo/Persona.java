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
@Table(name = "Personas")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Persona;

	@Column(name = "dni", length = 8)
	private String dni;

	@Column(name = "nombre", length = 50)
	private String nombre;

	@Column(name = "apellido", length = 50)
	private String apellido;

	@Column(name = "direccion", length = 80)
	private String direccion;

	@Column(name = "telefono", length = 9)
	private String telefono;

	@Column(name = "correo", length = 30)
	private String correo;
}
