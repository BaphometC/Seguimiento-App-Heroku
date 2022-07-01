package com.seguimiento.repository.proveedor;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import java.util.List;

import com.seguimiento.model.Proveedor;

public interface ProveedorService {
    List < Proveedor > findAll();

    ResponseEntity<Proveedor> save(Proveedor proveedor);

    Optional < Proveedor > findById(Long proveedorId);

    void delete(Long proveedorId);

}
