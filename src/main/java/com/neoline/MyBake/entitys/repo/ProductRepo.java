package com.neoline.MyBake.entitys.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoline.MyBake.entitys.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
