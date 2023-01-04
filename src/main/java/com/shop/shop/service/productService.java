package com.shop.shop.service;


import com.shop.shop.entity.product;
import org.springframework.web.multipart.MultipartFile;

public interface productService {
    public product createProduct(Long id_product, String product_name, String product_description, String product_type, Double price, byte[] product_image);

    public void deleteProduct(Long id);

    product updateProduct(Long id_product, String product_name, String product_description, String product_type, Double price, byte[] product_image);

    product getOrderById(Long id);
}
