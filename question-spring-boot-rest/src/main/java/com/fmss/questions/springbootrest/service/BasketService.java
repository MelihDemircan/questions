package com.fmss.questions.springbootrest.service;

import com.fmss.questions.springbootrest.data.Basket;
import com.fmss.questions.springbootrest.data.BasketLineItem;
import com.fmss.questions.springbootrest.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasketService {

    private final BasketRepository basketRepository;

    public Long addBasket(Long basketId, Long productId) {
        Basket basket = basketId == null ? new Basket() : basketRepository.findById(basketId).orElse(new Basket());
        basket.getLineItems().add(new BasketLineItem(productId, basket));
        return basketRepository.save(basket).getId();
    }

    public Basket getBasket(Long basketId) {
        return basketRepository.findById(basketId).orElse(null);
    }

    public void deleteBasket(Long basketId) {
        basketRepository.deleteById(basketId);
    }

}
