package com.fmss.questions.springbootrest.controller;

import com.fmss.questions.springbootrest.data.Basket;
import com.fmss.questions.springbootrest.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/basket")
public class BasketController {

    private final BasketService basketService;

    @PostMapping({"{basketId}", ""})
    public ResponseEntity<Long> add(@PathVariable(required = false) Long basketId, @RequestBody Long productId) {
        Long id = basketService.addBasket(basketId, productId);
        return ResponseEntity.ok(id);
    }

    @GetMapping("{basketId}")
    public ResponseEntity<Basket> get(@PathVariable Long basketId) {
        Basket basket = basketService.getBasket(basketId);
        return ResponseEntity.ok(basket);
    }

    @DeleteMapping("{basketId}")
    public ResponseEntity<Void> delete(@PathVariable Long basketId) {
        basketService.deleteBasket(basketId);
        return ResponseEntity.ok().build();
    }

}
