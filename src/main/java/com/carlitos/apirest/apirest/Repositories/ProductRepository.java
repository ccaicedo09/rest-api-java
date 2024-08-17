package com.carlitos.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlitos.apirest.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
