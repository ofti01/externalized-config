package com.lotfi.productservice.repositories;

import com.lotfi.productservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepsitory extends JpaRepository<Product, Long> {
}
