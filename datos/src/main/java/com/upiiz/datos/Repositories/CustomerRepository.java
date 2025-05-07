package com.upiiz.datos.Repositories;

import com.upiiz.datos.Models.CustomerModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository {
    List<CustomerModel> findAll();
    CustomerModel findById(int id);
    void save(CustomerModel customer);
    void delete(int id);
    void update(CustomerModel customer);
}
