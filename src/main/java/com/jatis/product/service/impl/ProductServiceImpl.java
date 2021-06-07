package com.jatis.product.service.impl;

import com.jatis.product.model.Product;
import com.jatis.product.objects.request.ProductRequest;
import com.jatis.product.repository.ProductRepository;
import com.jatis.product.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @SneakyThrows
    public List<Product> list(){
        return productRepository.findAll();
    }

    @SneakyThrows
    public Product post(ProductRequest request){
        Product PRODUCT = Product.builder()
                .productName(request.getProductName())
                .description(request.getDescription())
                .build();
        return productRepository.save(PRODUCT);
    }

}
