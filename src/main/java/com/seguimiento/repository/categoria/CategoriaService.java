package com.seguimiento.repository.categoria;

import java.util.Optional;
import java.util.List;

import com.seguimiento.model.Categoria;

public interface CategoriaService {
    List < Categoria > findAll();

    void save(Categoria categoria);

    Optional < Categoria > findById(Long categoriaId);

    void delete(Long categoriaId);

}
