package com.nhcarrigan.catalogservice.repository;

import com.nhcarrigan.catalogservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    boolean existsBySku(String sku);

    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByCategoryContainingIgnoreCase(String category);

    Optional<Product> findBySku(String sku);

    @Query("SELECT DISTINCT p.category FROM Product p")
    List<String> listCategories();
}
