package com.jatis.product.repository;

import com.jatis.product.model.Product;
import com.jatis.product.objects.request.ProductRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
