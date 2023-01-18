package com.example.FurnitureManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FurnitureManagementSystem.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
