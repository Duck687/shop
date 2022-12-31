package com.shop.shop.service.impl;

import com.shop.shop.entity.order;
import com.shop.shop.repository.orderRepository;
import com.shop.shop.service.orderService;
import org.springframework.stereotype.Service;

@Service
public class orderServiceImpl implements orderService {

    private orderRepository repository;

    public orderServiceImpl(orderRepository repository) {
        this.repository = repository;
    }

    @Override
    public order createOrder(Long id_order, Long id_user, Long id_product, Long count_product) {
        order Order = makeOrder(id_order,id_user,id_product,count_product);
        return repository.save(Order);
    }

    @Override
    public order updateOrder(Long id_order, Long id_user, Long id_product, Long count_product) {
        order Order = makeOrder(id_order,id_user,id_product,count_product);
        return repository.save(Order);
    }

    @Override
    public order getOrderById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
    private order makeOrder(Long id_order, Long id_user, Long id_product, Long count_product)
    {
        return new order(id_order,id_user,id_product,count_product);
    }
}
