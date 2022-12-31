package com.shop.shop.service.impl;

import com.shop.shop.entity.response;
import com.shop.shop.repository.respRepository;
import com.shop.shop.service.responseService;
import org.springframework.stereotype.Service;

@Service
public class responseServiceImpl implements responseService {
    private respRepository repository;

    public responseServiceImpl(respRepository repository) {
        this.repository = repository;
    }

    @Override
    public response createResponse(Integer id_response, Integer id_user, Integer id_product) {
        response Resp = new response( id_response,  id_user,  id_product);
        return repository.save(Resp);
    }

    @Override
    public void deleteResponse(Long id) {
        repository.deleteById(id);
    }

    @Override
    public response updateResponce(Integer id_response, Integer id_user, Integer id_product) {
        response Resp = new response( id_response,  id_user,  id_product);
        return repository.save(Resp);
    }

    @Override
    public response getOrderById(Long id) {
        return repository.findById(id).get();
    }
}
