package com.upiiz.datos.Services;


import com.upiiz.datos.Models.CommentModel;
import com.upiiz.datos.Models.ProductModel;
import com.upiiz.datos.Repositories.CommentRepository;
import com.upiiz.datos.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


//implement - Interfes
//extend    - Herencia
@Service
public class CommentService implements CommentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CommentModel> findAll() {
        return List.of();
    }

    @Override
    public CommentModel findByID(long id) {
        return null;
    }

    @Override
    public List<CommentModel> FindCommentProductById(int idProduct) {

        return jdbcTemplate.query("SELECT * FROM comments WHERE id=?", new BeanPropertyRowMapper<>(CommentModel.class), idProduct);
    }

    @Override
    public void save(CommentModel comment) {
        jdbcTemplate.update("INSERT INTO comments(text, id_product) VALUES(?,?)",comment.getText(),comment.getIdProduct());
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(CommentModel comment) {

    }
}
