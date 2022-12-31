package com.shop.shop.entity;
import jakarta.persistence.*;

@Entity
@Table
public class response {
    private Integer id_response;
    private Integer id_user;
    private Integer id_product;

    public response() {
    }

    public response(Integer id_response, Integer id_user, Integer id_product) {
        this.id_response = id_response;
        this.id_user = id_user;
        this.id_product = id_product;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_response() {
        return id_response;
    }

    public void setId_response(Integer id_response) {
        this.id_response = id_response;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }
}

