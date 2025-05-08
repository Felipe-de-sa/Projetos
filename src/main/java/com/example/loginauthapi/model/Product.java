package com.example.loginauthapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long id;

    @Setter
    @NotNull
    @Column(name = "tx_name")
    private String name;

    @Setter
    @NotNull
    @Column(name = "tx_description")
    private String description;

    @Setter
    @NotNull
    @Column(name = "nb_value")
    private BigDecimal value;


    @Setter
    @NotNull
    @Column(name = "tx_url")
    private String url;

    public Product(){}

    public Product(String name,BigDecimal value, String description, String url){
        this.name = name;
        this.description = description;
        this.value = value;
        this.url = url;
    }

}