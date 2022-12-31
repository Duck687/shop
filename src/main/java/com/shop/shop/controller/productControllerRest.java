package com.shop.shop.controller;


import com.shop.shop.dto.OrderDto;
import com.shop.shop.dto.ProductDto;
import com.shop.shop.entity.order;
import com.shop.shop.entity.product;
import com.shop.shop.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class productControllerRest {
    @Autowired
    private productService ProductService;

    public productControllerRest(productService ProductService) {
        this.ProductService = ProductService;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<product> createProduct(@RequestBody ProductDto product)
    {
        product Prod = ProductService.createProduct(product.id_product, product.product_name, product.product_description, product.product_type, product.price, product.product_image);

        return ResponseEntity.status(HttpStatus.CREATED).body(Prod);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public  ResponseEntity<product> updateProduct(@RequestBody ProductDto product)
    {
        product Prod = ProductService.createProduct(product.id_product, product.product_name, product.product_description, product.product_type, product.price, product.product_image);

        return ResponseEntity.ok(Prod);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  ResponseEntity<product> getProductbyId(@PathVariable("id") Long id)
    {
        product Prod = ProductService.getOrderById(id);
        return ResponseEntity.ok(Prod);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteProductbyId(@PathVariable("id") Long id)
    {
        ProductService.deleteProduct(id);
    }
}
