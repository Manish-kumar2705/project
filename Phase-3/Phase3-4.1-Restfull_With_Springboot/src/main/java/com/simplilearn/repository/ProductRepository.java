package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.entity.ProductEntity;



public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}

