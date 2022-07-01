package com.seguimiento.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Proveedor;
import com.seguimiento.model.Suscripcion;
import com.seguimiento.model.Usuario;
import com.seguimiento.repository.proveedor.ProveedorRepository;
import com.seguimiento.repository.proveedor.ProveedorService;
import com.seguimiento.repository.usuario.UsuarioRepository;

@RestController
public class ProveedorController implements ProveedorService{
	
	@Autowired
	private ProveedorRepository proveedorRepo;
	
	@GetMapping("/proveedores")
	public List<Proveedor> findAll() {
		List<Proveedor> proveedorlist = proveedorRepo.findAll();
		return proveedorlist;
	}

	@GetMapping("/proveedores/{proveedorId}")
	public Optional < Proveedor > findById(@PathVariable Long proveedorId) {
		return proveedorRepo.findById(proveedorId);
	}

	@PostMapping("/proveedores/newproveedor")
	public ResponseEntity<Proveedor> save(Proveedor proveedor){
		proveedorRepo.save(proveedor);
		return new ResponseEntity<Proveedor>(proveedor, HttpStatus.OK);
	}
	
	@PostMapping("/proveedores/delete/{proveedorId}")
	public void delete(@PathVariable Long proveedorId){
		proveedorRepo.deleteById(proveedorId);
	}

}
