package com.seguimiento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Categoria;
import com.seguimiento.model.Usuario;
import com.seguimiento.repository.categoria.CategoriaRepository;
import com.seguimiento.repository.categoria.CategoriaService;
import com.seguimiento.repository.usuario.UsuarioRepository;

@RestController
public class CategoriaController implements CategoriaService{
	@Autowired
	private CategoriaRepository categoriaRepo;
	
	@GetMapping("/categorias")
	public List<Categoria> findAll() {
		List<Categoria> categorialist = categoriaRepo.findAll();
		return categorialist;
	}

	@GetMapping("/categorias/{categoriaId}")
	public Optional < Categoria > findById(@PathVariable Long categoriaId) {
		return categoriaRepo.findById(categoriaId);
	}

	@PostMapping("/categorias/newcategoria")
	public void save(Categoria categoria) {
		categoriaRepo.save(categoria);
	}
	
	@PostMapping("/categorias/delete/{categoriaId}")
	public void delete(@PathVariable Long categoriaId){
		categoriaRepo.deleteById(categoriaId);
	}
}
