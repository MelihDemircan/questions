package com.fmss.questions.springbootrest.repository;

import com.fmss.questions.springbootrest.data.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {

}
