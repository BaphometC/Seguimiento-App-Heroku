package com.seguimiento.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre_servicio() {
		return nombre_servicio;
	}

	public void setNombre_servicio(String nombre_servicio) {
		this.nombre_servicio = nombre_servicio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	private String nombre;
	private String nombre_servicio;
	private String categoria;
	private Double costo;
	private String website;
	private String correo;
	@OneToMany(mappedBy = "proveedor")
	private List<Suscripcion> suscripciones;

	public Proveedor() {

	}

	public Proveedor(String nombre, String nombre_servicio, String categoria, Double costo, String website,
			String correo) {
		super();
		this.nombre = nombre;
		this.nombre_servicio = nombre_servicio;
		this.categoria = categoria;
		this.costo = costo;
		this.website = website;
		this.correo = correo;
	}

}
