package com.shop.shop.service.impl;

import com.shop.shop.entity.product;
import com.shop.shop.entity.user;
import com.shop.shop.service.productService;
import com.shop.shop.repository.prodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productServiceImpl implements productService {

    private prodRepository repository;

    public productServiceImpl(prodRepository repository) {
        this.repository = repository;
    }

    @Override
    public product createProduct(Long id_product, String product_name, String product_description, String product_type, Double price, byte[] product_image) {
        product Prod = new product(id_product, product_name, product_description, product_type, price, product_image);
        return repository.save(Prod);
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    @Override
    public product updateProduct(Long id_product, String product_name, String product_description, String product_type, Double price, byte[] product_image) {
        product Prod = new product(id_product, product_name, product_description, product_type, price, product_image);
        return repository.save(Prod);
    }

    @Override
    public product getOrderById(Long id) {
        return repository.findById(id).get();
    }
}
