package com.shop.shop.repository;



import com.shop.shop.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface prodRepository extends JpaRepository<product, Long> {
}
