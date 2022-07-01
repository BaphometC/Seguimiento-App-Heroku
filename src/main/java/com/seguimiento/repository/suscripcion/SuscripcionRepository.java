package com.seguimiento.repository.suscripcion;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seguimiento.model.Mes;
import com.seguimiento.model.Suscripcion;
import com.seguimiento.model.Usuario;


public interface SuscripcionRepository extends JpaRepository<Suscripcion, Long>{

	List<Suscripcion>findByUsuario(Usuario usuario);
	
	List<Suscripcion>findByMes(Mes mes);
}
