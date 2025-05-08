package com.example.loginauthapi.repositories;

import com.example.loginauthapi.domain.user.ProductMapper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductMapper,Long> {
}
