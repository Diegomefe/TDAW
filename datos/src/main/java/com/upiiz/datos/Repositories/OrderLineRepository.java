package com.upiiz.datos.Repositories;


import com.upiiz.datos.Models.OrderLineModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderLineRepository {
    List<OrderLineModel> findAll();
    OrderLineModel findById(int id);
    void save(OrderLineModel orderLine);
    void delete(int id);
    void update(OrderLineModel orderLine);

}
