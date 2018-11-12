package com.krew.restaurant.rest;

import com.krew.restaurant.dao.ItemDAO;
import com.krew.restaurant.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderMangement {

    @Autowired
    ItemDAO dao;

    /**
     * Create an order of {@link Item} to persist.
     * @param body
     * @return
     */
    @PostMapping("/order")
    public ResponseEntity createOrder(@RequestBody Item body){
        dao.insert(body);

        return new ResponseEntity("Order Created for " + body, HttpStatus.OK);
    }

    /**
     * Retrieve the order, which will be a list of {@link Item} based on the table number.
     *
     * @param tableNbr
     * @return
     */
    @GetMapping("/table/{tableNbr}")
    public ResponseEntity getOrder(@PathVariable Integer tableNbr){
        List<Item> result = dao.get(tableNbr);

        return new ResponseEntity(result, HttpStatus.OK);
    }
}
