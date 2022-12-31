package com.shop.shop.entity;
import jakarta.persistence.*;

@Entity
@Table
public class basket {
    private Long id_basket;
    private Long id_user;
    private Long id_product;
    private Long count_product;

    @Override
    public String toString() {
        return "basket{" +
                "id_basket=" + id_basket +
                ", id_user=" + id_user +
                ", id_product=" + id_product +
                ", count_product=" + count_product +
                '}';
    }

    public basket() {
    }

    public basket(Long id_basket, Long id_user, Long id_product, Long count_product) {
        this.id_basket = id_basket;
        this.id_user = id_user;
        this.id_product = id_product;
        this.count_product = count_product;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId_basket() {
        return id_basket;
    }

    public void setId_basket(Long id_basket) {
        this.id_basket = id_basket;
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

