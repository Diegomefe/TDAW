package com.upiiz.datos.Services;

import com.upiiz.datos.Models.OrderModel;
import com.upiiz.datos.Repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderRepository {
    @Override
    public List<OrderModel> findAll() {
        return List.of();
    }

    @Override
    public OrderModel findById(int id) {
        return null;
    }

    @Override
    public void save(OrderModel order) {

    }

    @Override
    public void update(OrderModel order) {

    }

    @Override
    public void delete(int id) {

    }

}
