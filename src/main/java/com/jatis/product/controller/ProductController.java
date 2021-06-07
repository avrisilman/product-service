package com.jatis.product.controller;

import com.jatis.product.objects.request.ProductRequest;
import com.jatis.product.objects.response.ProductResponse;
import com.jatis.product.objects.response.Response;
import com.jatis.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "api")
public class ProductController {

    final ProductService productService;

    @Value("${http.response.ok}")
    private String success;

    @GetMapping(value = "/products")
    public Response<ProductResponse> list(){
        return new Response<>(HttpStatus.OK.value(), success, productService.list());
    }

    @PostMapping(value = "/products")
    public Response<ProductResponse> post(@Valid @RequestBody ProductRequest request){
        return new Response<>(HttpStatus.OK.value(), success, productService.post(request));
    }


}
