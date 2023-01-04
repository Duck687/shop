package com.shop.shop.Restcontroller;



import com.shop.shop.dto.ProductDto;
import com.shop.shop.entity.product;
import com.shop.shop.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

@RestController
@RequestMapping("/product")
public class productControllerRest {
    @Autowired
    private productService ProductService;

    public productControllerRest(productService ProductService) {
        this.ProductService = ProductService;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<product> createProduct(@RequestBody ProductDto product) throws IOException {
        byte[] image = Base64.getDecoder().decode(product.image);
        String directory="C:\\Users\\bogda\\Desktop\\shop\\src\\images\\"+product.id_product+".jpg";

        new FileOutputStream(directory).write(image);
        product Prod = ProductService.createProduct(product.id_product, product.product_name, product.product_description, product.product_type, product.price, image);

        return ResponseEntity.status(HttpStatus.CREATED).body(Prod);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public  ResponseEntity<product> updateProduct(@RequestBody ProductDto product) {
        byte[] image = Base64.getDecoder().decode(product.image);
        product Prod = ProductService.createProduct(product.id_product, product.product_name, product.product_description, product.product_type, product.price, image);

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
