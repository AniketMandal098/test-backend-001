package com.example.demo.controller.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Basic CRUD methods (save, findById, findAll, delete) are inherited.
}
