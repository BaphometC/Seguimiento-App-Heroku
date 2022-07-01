package com.seguimiento.repository.suscripcion;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import java.util.List;

import com.seguimiento.model.Suscripcion;
import com.seguimiento.model.Usuario;

public interface SuscripcionService {
    List < Suscripcion > findAll();

    ResponseEntity<Suscripcion> save(Suscripcion suscripcion);

   // Optional < Suscripcion > findById(long suscripcionId);
    
    ResponseEntity<List < Suscripcion >> findByUsuario(long idUsuario);

    void delete(Long suscripcionId);
}
