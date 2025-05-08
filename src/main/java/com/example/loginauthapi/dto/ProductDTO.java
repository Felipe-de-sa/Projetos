package com.example.loginauthapi.dto;

import com.transire.lojavirtual.model.Product;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDTO {
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal value;

    @NotNull
    private String description;

    @NotNull
    private String url;

    public class ProductMapper {
        public static Product convert(ProductDTO productDto) {
            return new Product(productDto.getName(), productDto.getValue(), productDto.getDescription(), productDto.getUrl());
        }

        public static List<ProductDTO> convert(List<Product> products) {
            return products.stream().map(ProductDTO::new).collect(Collectors.toList());
        }

        public static Product merge(Product baseProduct, ProductDTO productDto) {
            baseProduct.setName(productDto.getName());
            baseProduct.setDescription(productDto.getDescription());
            baseProduct.setValue(productDto.getValue());
            baseProduct.setUrl(productDto.getUrl());
            return baseProduct;
        }
    }
