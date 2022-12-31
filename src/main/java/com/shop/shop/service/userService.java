package com.shop.shop.service;


import com.shop.shop.entity.user;

public interface userService {
    public user createUser(Long id_user, String name, String surname, String mail, String password, String phone_number, String role);

    public void deleteUser(Long id);

    user updateUser(Long id_user, String name, String surname, String mail, String password, String phone_number, String role);

    user getOrderById(Long id);
}
