package com.upiiz.datos.Repositories;

import com.upiiz.datos.Models.CommentModel;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentRepository {
    List<CommentModel> findAll();
    CommentModel findByID(long id);
    List<CommentModel> FindCommentProductById(int idProduct);
    void save(CommentModel comment);
    void delete(int id);
    void update(CommentModel comment);
}
