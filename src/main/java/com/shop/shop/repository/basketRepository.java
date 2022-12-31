package com.shop.shop.repository;



import com.shop.shop.entity.basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface basketRepository extends JpaRepository<basket, Long> {
}
