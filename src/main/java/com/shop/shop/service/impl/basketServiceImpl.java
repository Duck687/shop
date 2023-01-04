package com.shop.shop.service.impl;

import com.shop.shop.entity.basket;
import com.shop.shop.repository.basketRepository;
import com.shop.shop.service.basketService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class basketServiceImpl implements basketService {

    private basketRepository repository;

    public basketServiceImpl(basketRepository repository) {
        this.repository = repository;
    }

    @Override
    public basket createBasket(Long id_basket, Long id_user, Long id_product, Long count_product) {
        basket Basket =  new basket(id_basket,id_user,id_product,count_product);
        return repository.save(Basket);
    }

    @Override
    public basket updateBasket(Long id_basket, Long id_user, Long id_product, Long count_product) {
        basket Basket =  new basket(id_basket,id_user,id_product,count_product);
        return repository.save(Basket);
    }

    @Override
    public basket getBasketById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteBasket(Long id) {
        repository.deleteById(id);
    }

}
