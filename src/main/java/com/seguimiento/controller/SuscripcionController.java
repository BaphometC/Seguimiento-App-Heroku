package com.seguimiento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Suscripcion;
import com.seguimiento.model.Usuario;
import com.seguimiento.repository.proveedor.ProveedorRepository;
import com.seguimiento.repository.suscripcion.SuscripcionRepository;
import com.seguimiento.repository.suscripcion.SuscripcionService;
import com.seguimiento.repository.usuario.UsuarioRepository;

@RestController
public class SuscripcionController implements SuscripcionService{

	@Autowired
	private SuscripcionRepository suscripcionRepo;
	@Autowired
	private UsuarioRepository usuarioRepo;

	
	@GetMapping("/suscripciones")
	public List<Suscripcion> findAll() {
		List<Suscripcion> suscripcionlist = suscripcionRepo.findAll();
		return suscripcionlist;
	}

	//@GetMapping("/suscripciones/{suscripcionId}")
	//public Optional < Suscripcion > findById(@PathVariable long suscripcionId) {
	//	return suscripcionRepo.findById(suscripcionId);
	//}
	
	@GetMapping("/suscripciones/{idUsuario}")
	public ResponseEntity<List < Suscripcion >> findByUsuario(@PathVariable long idUsuario) {
		List<Suscripcion> lista = suscripcionRepo.findByUsuario(usuarioRepo.findById(idUsuario).get());
		return new ResponseEntity<List<Suscripcion>>(lista, HttpStatus.OK);
	}

	@PostMapping("/suscripciones/newsuscripcion")
	public ResponseEntity<Suscripcion> save(Suscripcion suscripcion) {
		Suscripcion suscripcion1 = suscripcionRepo.save(suscripcion);
		return new ResponseEntity<Suscripcion>(suscripcion1, HttpStatus.OK);
	}
	
	@PostMapping("/suscripciones/delete/{suscripcionId}")
	public void delete(@PathVariable Long suscripcionId){
		suscripcionRepo.deleteById(suscripcionId);
	}
	
	//Notificacion Prueba #1
	//
	//@GetMapping("/suscripciones/notificaciones/{idUsuario}")
	//public ResponseEntity<List < Suscripcion >> findByUsuarioN(@PathVariable long idUsuario) {
	//	List<Suscripcion> listasuscripciones = suscripcionRepo.findByUsuario(usuarioRepo.findById(idUsuario).get());
	//	int cero = listasuscripciones.get(0);
	//	return new ResponseEntity<List<Suscripcion>>(listasuscripciones, HttpStatus.OK);
	//}

}
