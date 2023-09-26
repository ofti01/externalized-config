package com.lotfi.productservice.controllers;

import com.lotfi.productservice.entities.Product;
import com.lotfi.productservice.repositories.ProductRepsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product-service")
public class ProductController {

    private final ProductRepsitory productRepsitory;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
        productRepsitory.save(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProducts(){
        List<Product> pr = new ArrayList<>();
        if ( productRepsitory.findAll() != null) return productRepsitory.findAll();
        else return pr;
    }

}
