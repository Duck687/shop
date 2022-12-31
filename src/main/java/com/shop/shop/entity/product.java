package com.shop.shop.entity;

import jakarta.persistence.*;

@Entity
@Table
public class product {
    private Long id_product;
    private String product_name;
    private String product_description;
    private String product_type;
    private Double price;
    @Lob
    private byte[] product_image;

    public product() {
    }

    public product(Long id_product, String product_name, String product_description, String product_type, Double price, byte[] product_image) {
        this.id_product = id_product;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_type = product_type;
        this.price = price;
        this.product_image = product_image;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public byte[] getProduct_image() {
        return product_image;
    }

    public void setProduct_image(byte[] product_image) {
        this.product_image = product_image;
    }
}
