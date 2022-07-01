package com.seguimiento.model;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "mes")
public class Mes {

    @Id
    private long id;
    private String nombre;
    @OneToMany(mappedBy = "mes")
	private List<Suscripcion> suscripciones;

    public long getIdMes() {
        return id;
    }

    public Mes(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
    
    public Mes() {
    	
    }

	public void setIdMes(long idMes) {
        this.id = idMes;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
}
