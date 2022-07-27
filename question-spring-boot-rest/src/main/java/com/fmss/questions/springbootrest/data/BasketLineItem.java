package com.fmss.questions.springbootrest.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class BasketLineItem {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long productId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "basket_id", nullable = false)
    private Basket basket;

    public BasketLineItem(Long productId, Basket basket) {
        this.productId = productId;
        this.basket = basket;
    }

}
