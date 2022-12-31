package com.shop.shop.service.impl;

import com.shop.shop.entity.user;
import com.shop.shop.repository.userRepository;
import com.shop.shop.service.userService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    userRepository repository;

    public userServiceImpl(userRepository repository) {
        this.repository = repository;
    }

    @Override
    public user createUser(Long id_user, String name, String surname, String mail, String password, String phone_number, String role) {
        user User = new user( id_user,  name,  surname,  mail,  password,  phone_number,  role);
        return repository.save(User);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

    @Override
    public user updateUser(Long id_user, String name, String surname, String mail, String password, String phone_number, String role) {
        user User = new user( id_user,  name,  surname,  mail,  password,  phone_number,  role);
        return repository.save(User);
    }

    @Override
    public user getOrderById(Long id) {
        return repository.findById(id).get();
    }
}
