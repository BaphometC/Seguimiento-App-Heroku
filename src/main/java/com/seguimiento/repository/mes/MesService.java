package com.seguimiento.repository.mes;

import java.util.Optional;
import java.util.List;

import com.seguimiento.model.Mes;

public interface MesService {
    List < Mes > findAll();

    void save(Mes mes);

    Optional < Mes > findById(Long mesId);

    void delete(Long mesId);

}
