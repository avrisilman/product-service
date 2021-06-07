package com.jatis.product.service;

import com.jatis.product.model.Product;
import com.jatis.product.objects.request.ProductRequest;

import java.util.List;

public interface ProductService {
    List<Product> list();
    Product post(ProductRequest request);
}
