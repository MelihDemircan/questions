package com.paycell.ecommerce.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author Melih Demircan
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/product-sales-info")
public class InternalProductSalesInfoController {

    @PostMapping("psi-on-sale-control")
    public ResponseEntity<Void> psiOnSaleControl(@RequestBody Set<Long> identifiers) {
        return ResponseEntity.ok().build();
    }

}
