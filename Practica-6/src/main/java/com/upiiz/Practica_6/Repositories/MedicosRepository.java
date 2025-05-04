package com.upiiz.Practica_6.Repositories;

import com.upiiz.Practica_6.Models.MedicosModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicosRepository {

    List<MedicosModel> findAll();
    MedicosModel findById(int id);
    void save(MedicosModel medico);
    void update(MedicosModel medico);
    void delete(int id);
}
