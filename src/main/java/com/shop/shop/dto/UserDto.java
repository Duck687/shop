package com.shop.shop.dto;

import jakarta.persistence.Column;

public class UserDto {
    @Column
    public Long id_user;
    @Column
    public String name;
    @Column
    public String surname;
    @Column
    public String mail;
    @Column
    public String password;
    @Column
    public String phone_number;
    @Column
    public String role;

    public UserDto(Long id_user, String name, String surname, String mail, String password, String phone_number, String role) {
        this.id_user = id_user;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.phone_number = phone_number;
        this.role = role;
    }

    public UserDto() {

    }
}
