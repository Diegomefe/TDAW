package com.upiiz.Practica_6.Repositories;

import com.upiiz.Practica_6.Models.PacientesModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacientesRepository {

    List<PacientesModel> findAll();
    PacientesModel findById(int id);
    void save(PacientesModel paciente);
    void update(PacientesModel paciente);
    void delete(int id);

}
