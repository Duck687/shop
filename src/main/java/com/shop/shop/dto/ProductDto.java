package com.shop.shop.dto;

import jakarta.persistence.Lob;

public class ProductDto {
    public Long id_product;
    public String product_name;
    public String product_description;
    public String product_type;
    public Double price;
    @Lob
    public byte[] product_image;

    public ProductDto() {
    }

    public ProductDto(Long id_product, String product_name, String product_description, String product_type, Double price, byte[] product_image) {
        this.id_product = id_product;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_type = product_type;
        this.price = price;
        this.product_image = product_image;
    }
}
