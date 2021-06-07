package com.jatis.product.objects.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class ProductRequest {

    @NotEmpty(message = "productName cant empty")
    private String productName;

    @NotEmpty(message = "description cant empty")
    private String description;

}
