package com.platzi_market.persistence;

import com.platzi_market.persistence.crud.ProductoCrudRepository;
import com.platzi_market.persistence.entity.Producto;
import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> GetAll() {
        return (List<Producto>)productoCrudRepository.findAll();
    }

}
