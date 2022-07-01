package com.seguimiento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.Categoria;
import com.seguimiento.model.Mes;
import com.seguimiento.repository.categoria.CategoriaRepository;
import com.seguimiento.repository.mes.MesRepository;
import com.seguimiento.repository.mes.MesService;

@RestController
public class MesController implements MesService{
	@Autowired
	private MesRepository mesRepo;
	
	@GetMapping("/meses")
	public List<Mes> findAll() {
		List<Mes> meslist = mesRepo.findAll();
		return meslist;
	}

	@GetMapping("/meses/{mesId}")
	public Optional < Mes > findById(@PathVariable Long mesId) {
		return mesRepo.findById(mesId);
	}

	@PostMapping("/meses/newmes")
	public void save(Mes mes) {
		mesRepo.save(mes);
	}
	
	@PostMapping("/meses/delete/{mesId}")
	public void delete(@PathVariable Long mesId){
		mesRepo.deleteById(mesId);
	}
}
