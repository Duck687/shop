package com.shop.shop.repository;



import com.shop.shop.entity.response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface respRepository extends JpaRepository<response, Long>  {
}
