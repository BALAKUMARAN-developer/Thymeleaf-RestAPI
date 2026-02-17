package com.fullstackcrud.Thymeleaf.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackcrud.Thymeleaf.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
