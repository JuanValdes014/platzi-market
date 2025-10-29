package com.platzi_market.persistence;

import com.platzi_market.persistence.crud.ProductoCrudRepository;
import com.platzi_market.persistence.entity.Producto;
import org.hibernate.mapping.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> GetAll() {
        return (List<Producto>)productoCrudRepository.findAll();
    }

    public List<Producto> GetByIdCategoria(int idCategoria) {
        return (List<Producto>)productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> GetEscasos(int cantidad, boolean estado) {
        return (Optional<List<Producto>>)productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, estado);
    }

    public Optional<Producto> getProducto(int idProducto) {
        return (Optional<Producto>)productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
