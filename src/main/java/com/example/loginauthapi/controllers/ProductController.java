package com.example.loginauthapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
@CrossOrigin(origins = "http://localhost:8080")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDto> findAll(){
        return this.productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ProductDto findById(@PathVariable("id") Long id){
        return this.productService.findById(id);
    }

    @PostMapping
    public ProductDto save(@RequestBody ProductDto productDto){
        return this.productService.save(productDto);
    }

    @PutMapping(value = "/{id}")
    public ProductDto update(@PathVariable(value = "id") Long id, @RequestBody ProductDto productDto){
        return this.productService.update(id,productDto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        this.productService.delete(id);
    }

}