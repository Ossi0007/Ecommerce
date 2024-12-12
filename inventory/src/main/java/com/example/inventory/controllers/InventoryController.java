package com.example.inventory.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
@Slf4j
public class InventoryController {

    @GetMapping("/get")
    ResponseEntity<String> getInventory(){
        return new ResponseEntity<>("Inventory", HttpStatus.OK);
    }
}
