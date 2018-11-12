package com.krew.restaurant.rest;

import com.krew.restaurant.dto.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderMangement {

    @PostMapping("/order")
    public ResponseEntity createOrder(@RequestBody Item body){
        return new ResponseEntity("Order Created for " + body, HttpStatus.OK);
    }
}
