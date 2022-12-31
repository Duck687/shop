package com.shop.shop.service;


import com.shop.shop.entity.response;

public interface responseService {
    public response createResponse(Integer id_response, Integer id_user, Integer id_product);

    public void deleteResponse(Long id);

    response updateResponce(Integer id_response, Integer id_user, Integer id_product);

    response getOrderById(Long id);
}
