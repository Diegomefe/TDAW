package com.upiiz.Practica_6.Services;

import com.upiiz.Practica_6.Models.PacientesModel;
import com.upiiz.Practica_6.Repositories.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesService implements PacientesRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<PacientesModel> findAll() {
        return jdbcTemplate.query("SELECT * FROM pacientes", new BeanPropertyRowMapper<>(PacientesModel.class));
    }

    @Override
    public PacientesModel findById(int id) {
        return jdbcTemplate.query("SELECT * FROM pacientes WHERE id=?", new BeanPropertyRowMapper<>(PacientesModel.class),id).stream().findFirst().orElse(new PacientesModel());
    }

    @Override
    public void save(PacientesModel paciente) {
        jdbcTemplate.update("INSERT INTO pacientes (nombre, dni, fecha_nacimiento) VALUES (?,?,?)", paciente.getNombre(), paciente.getDni(), paciente.getFecha_nacimiento());
    }

    @Override
    public void update(PacientesModel paciente) {
        jdbcTemplate.update("UPDATE pacientes SET nombre=?, dni=?, fecha_nacimiento=? WHERE id=?", paciente.getNombre(), paciente.getDni(), paciente.getFecha_nacimiento(), paciente.getId());

    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM pacientes WHERE id=?", id);

    }
}
