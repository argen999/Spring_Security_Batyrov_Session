package com.peaksoft.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @SequenceGenerator(name="product_seq",sequenceName = "product_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
    private Long id;
    private String name;
    private String brand;
    private double price;
}
