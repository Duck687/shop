package com.shop.shop.service;

import com.shop.shop.entity.basket;
import org.springframework.http.ResponseEntity;

public interface basketService {
    public basket createBasket(Long id_basket, Long id_user, Long id_product, Long count_product);

    public void deleteBasket(Long id);

    basket updateBasket(Long idBasket, Long idUser, Long idProduct, Long countProduct);

    basket getBasketById(Long id);
}
