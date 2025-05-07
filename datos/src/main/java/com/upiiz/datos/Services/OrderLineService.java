package com.upiiz.datos.Services;


import com.upiiz.datos.Models.OrderLineModel;
import com.upiiz.datos.Repositories.OrderLineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineService implements OrderLineRepository {
    @Override
    public List<OrderLineModel> findAll() {
        return List.of();
    }

    @Override
    public OrderLineModel findById(int id) {
        return null;
    }

    @Override
    public void save(OrderLineModel orderLine) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(OrderLineModel orderLine) {

    }
}
