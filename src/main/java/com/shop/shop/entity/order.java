package com.shop.shop.entity;

import jakarta.persistence.*;

@Entity
@Table
public class order {
    private Long id_order;
    private Long id_user;
    private Long id_product;
    private Long count_product;

    public order() {
    }

    public order(Long id_order, Long id_user, Long id_product, Long count_product) {
        this.id_order = id_order;
        this.id_user = id_user;
        this.id_product = id_product;
        this.count_product = count_product;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public Long getCount_product() {
        return count_product;
    }

    public void setCount_product(Long count_product) {
        this.count_product = count_product;
    }
}
