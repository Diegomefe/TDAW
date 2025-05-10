package com.upiiz.ExamenII.Services;

import com.upiiz.ExamenII.Models.ReservacionModel;
import com.upiiz.ExamenII.Repositories.ReservacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservacionService implements ReservacionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<ReservacionModel> findAll() {
        return jdbcTemplate.query("SELECT * From reservaciones", new BeanPropertyRowMapper<>(ReservacionModel.class));
    }

    @Override
    public ReservacionModel findById(int id) {
        return jdbcTemplate.query("SELECT * FROM reservaciones WHERE id=?", new BeanPropertyRowMapper<>(ReservacionModel.class), id).stream().findFirst().orElse(new ReservacionModel());
    }

    @Override
    public void save(ReservacionModel reserva) {
        jdbcTemplate.update("INSERT INTO reservaciones(nombre_cliente, fecha_entrada, fecha_salida) VALUES (?,?,?)", reserva.getNombre_cliente(),reserva.getFecha_entrada(), reserva.getFecha_salida());
    }

    @Override
    public void update(ReservacionModel reserva) {
        jdbcTemplate.update("UPDATE reservaciones SET nombre_cliente=?, fecha_entrada=?, fecha_salida=? WHERE id=?", reserva.getNombre_cliente(), reserva.getFecha_entrada(), reserva.getFecha_salida(), reserva.getId());
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM reservaciones WHERE id=?", id);
    }
}
