package com.nhcarrigan.catalogservice.repository;

import com.nhcarrigan.catalogservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> getBySku(String sku);

    boolean existsBySku(String sku);

    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByCategoryContainingIgnoreCase(String category);

    @Query("SELECT DISTINCT p.category FROM Product p")
    List<String> listCategories();

    //Price Range Filter
    List<Product> findByPriceGreaterThanEqual(BigDecimal minPrice); //only a floor
    List<Product> findByPriceLessThanEqual(BigDecimal maxPrice); //only a ceiling
    List<Product> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice); //both floor and ceiling

}
