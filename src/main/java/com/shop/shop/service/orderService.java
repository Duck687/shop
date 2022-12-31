package com.shop.shop.service;

import com.shop.shop.entity.order;

public interface orderService {
    public order createOrder(Long id_order, Long id_user, Long id_product, Long count_product);

    public void deleteOrder(Long id);

    order updateOrder(Long idOrder, Long idUser, Long idProduct, Long countProduct);

    order getOrderById(Long id);
}
