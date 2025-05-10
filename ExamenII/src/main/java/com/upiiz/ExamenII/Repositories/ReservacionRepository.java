package com.upiiz.ExamenII.Repositories;

import com.upiiz.ExamenII.Models.ReservacionModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ReservacionRepository {

            //todos los productos
    List<ReservacionModel> findAll();
    //Un solo producto por su id
    ReservacionModel findById(int id);
    //agregar un producto
    void save(ReservacionModel product);
    //actualizar un producto
    void update(ReservacionModel product);
    //eliminar un producto por su id
    void delete(int id);
}
