package com.seguimiento.repository.usuario;

import java.util.Optional;

import com.seguimiento.model.Usuario;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface usuarioService {
	List < Usuario > findAll();

    void save(Usuario usuario) throws NoSuchAlgorithmException;	

    Optional < Usuario > findById(Long usuarioId);

    void delete(Long usuarioId);

}
