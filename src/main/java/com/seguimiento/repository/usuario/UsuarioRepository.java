package com.seguimiento.repository.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import com.seguimiento.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findByDni(long dni);
	
}
