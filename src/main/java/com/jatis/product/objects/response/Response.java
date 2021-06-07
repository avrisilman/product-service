package com.jatis.product.objects.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Response <T>{

    private int status;
    private String message;
    private Object result;

}
