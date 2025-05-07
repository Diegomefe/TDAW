package com.upiiz.datos.Services;


import com.upiiz.datos.Models.CustomerModel;
import com.upiiz.datos.Repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerRepository {
    @Override
    public List<CustomerModel> findAll() {
        return List.of();
    }

    @Override
    public CustomerModel findById(int id) {
        return null;
    }

    @Override
    public void save(CustomerModel customer) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(CustomerModel customer) {

    }
}
