package com.upiiz.datos.Repositories;


import com.upiiz.datos.Models.OrderModel;
import org.springframework.stereotype.Repository;

import java.util.List;
//Cantidad de registros mayores a 37550 - manejar long
@Repository
public interface OrderRepository {
    List<OrderModel> findAll();
    OrderModel findById(int id);
    void save(OrderModel order);
    void update(OrderModel order);
    void delete(int id);
}
