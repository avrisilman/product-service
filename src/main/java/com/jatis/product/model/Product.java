package com.jatis.product.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "app_product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "description")
    private String description;

}
