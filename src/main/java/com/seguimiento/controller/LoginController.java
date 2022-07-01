package com.seguimiento.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Usuario;
import com.seguimiento.repository.usuario.UsuarioRepository;


import utils.SHA512;

@RestController
public class LoginController {

	@Autowired
	private UsuarioRepository usuarioRepo;

	
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestParam Long dni, @RequestParam String password) throws NoSuchAlgorithmException{
		Usuario user = usuarioRepo.findByDni(dni);
		String passhasheado = SHA512.sha256(password);
		
		if(user.getPassword().equals(passhasheado)){
			return new ResponseEntity<Usuario>(user, HttpStatus.OK);
		}
		return new ResponseEntity<Usuario>(new Usuario(),HttpStatus.BAD_REQUEST);
	}

	
	
}
