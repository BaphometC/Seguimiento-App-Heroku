package com.seguimiento.repository.historiaPagoMes;

import java.util.Optional;
import java.util.List;

import com.seguimiento.model.HistoriaPagoMes;

public interface HistoriaPagoMesService {
    List < HistoriaPagoMes > findAll();

    void save(HistoriaPagoMes historiaPagoMes);

    Optional < HistoriaPagoMes > findById(Long historiaPagoMesId);

    void delete(Long historiaPagoMesId);

}
