package com.example.loginauthapi.domain.user;

import com.example.loginauthapi.dto.ProductDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public static ProductMapper convert(ProductDTO productDto){
        return new ProductMapper(productDto.getName(),productDto.getValue(),productDto.getDescription(),productDto.getUrl());
    }

    public static List<ProductDTO> convert(List<ProductMapper> products){
        return products.stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    public static ProductMapper merge(ProductMapper baseProduct, ProductDTO productDto){
        ProductMapper product = baseProduct;
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setValue(productDto.getValue());
        product.setUrl(productDto.getUrl());

        return product;
    }

}
