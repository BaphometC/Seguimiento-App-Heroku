package com.seguimiento.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	private long dni;
	private String password;
	private String nombre_completo;
	private String correo;
	private int telefono;
	private String direccion;
	private int codigo_postal;
	private String metodo_pago;
	private String rol;
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@OneToMany(mappedBy = "usuario")
	private List<Suscripcion> suscripciones;

	public Usuario() {

	}

	public Usuario(long dni, String password, String nombre_completo, String correo, int telefono, String direccion,
			int codigo_postal, String metodo_pago, String rol) {
		super();
		this.dni = dni;
		this.password = password;
		this.nombre_completo = nombre_completo;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.codigo_postal = codigo_postal;
		this.metodo_pago = metodo_pago;
		this.rol = rol;
	}


}