package com.seguimiento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.HistoriaPagoMes;
import com.seguimiento.model.Mes;
import com.seguimiento.repository.historiaPagoMes.HistoriaPagoMesService;
import com.seguimiento.repository.historiaPagoMes.HistoriaPagoRepository;
import com.seguimiento.repository.mes.MesRepository;

@RestController
public class HistoriaPagoController implements HistoriaPagoMesService{
	@Autowired
	private HistoriaPagoRepository historiaRepo;
	
	@GetMapping("/historiaspagos")
	public List<HistoriaPagoMes> findAll() {
		List<HistoriaPagoMes> historiaPagolist = historiaRepo.findAll();
		return historiaPagolist;
	}

	@GetMapping("/historiaspagos/{historiapagoId}")
	public Optional < HistoriaPagoMes > findById(@PathVariable Long historiapagoId) {
		return historiaRepo.findById(historiapagoId);
	}

	@PostMapping("/historiaspagos/newhistoriapago")
	public void save(HistoriaPagoMes historiapago) {
		historiaRepo.save(historiapago);
	}
	
	@PostMapping("/historiaspagos/delete/{historiapagoId}")
	public void delete(@PathVariable Long historiapagoId){
		historiaRepo.deleteById(historiapagoId);
	}
}
