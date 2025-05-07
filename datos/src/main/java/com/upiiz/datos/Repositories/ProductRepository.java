package com.upiiz.datos.Repositories;

import com.upiiz.datos.Models.ProductModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository {
    //Menu

    //todos los productos
    List<ProductModel> findAll();
    //Un solo producto por su id
    ProductModel findById(int id);
    //agregar un producto
    void save(ProductModel product);
    //actualizar un producto
    void update(ProductModel product);
    //eliminar un producto por su id
    void delete(int id);
}
