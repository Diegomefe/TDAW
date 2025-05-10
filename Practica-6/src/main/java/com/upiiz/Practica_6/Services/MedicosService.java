package com.upiiz.Practica_6.Services;

import com.upiiz.Practica_6.Models.MedicosModel;
import com.upiiz.Practica_6.Repositories.MedicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicosService implements MedicosRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<MedicosModel> findAll() {
        return jdbcTemplate.query("SELECT * FROM medicos", new BeanPropertyRowMapper<>(MedicosModel.class));
    }

    @Override
    public MedicosModel findById(int id) {
        return jdbcTemplate.query("SELECT * FROM medicos WHERE id = ?", new BeanPropertyRowMapper<>(MedicosModel.class), id).stream().findFirst().orElse(new MedicosModel());
    }

    @Override
    public void save(MedicosModel medico) {
        jdbcTemplate.update("INSERT INTO medicos (nombre, especialidad, matricula) VALUES (?,?,?)", medico.getNombre(), medico.getEspecialidad(), medico.getMatricula());
    }

    @Override
    public void update(MedicosModel medico) {
        jdbcTemplate.update("UPDATE medicos SET nombre=?, especialidad=?, matricula=? WHERE id =?", medico.getNombre(), medico.getEspecialidad(), medico.getMatricula(), medico.getId());
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM medicos WHERE id=?", id);

    }
}
