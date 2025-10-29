package com.platzi_market.persistence.crud;

import com.platzi_market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
