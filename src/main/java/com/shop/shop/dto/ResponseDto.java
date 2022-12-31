package com.shop.shop.dto;

public class ResponseDto {
    public Integer id_response;
    public Integer id_user;
    public Integer id_product;

    public ResponseDto() {
    }

    public ResponseDto(Integer id_response, Integer id_user, Integer id_product) {
        this.id_response = id_response;
        this.id_user = id_user;
        this.id_product = id_product;
    }

}
