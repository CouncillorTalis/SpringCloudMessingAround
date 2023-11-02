package com.talis.shoppingservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shop-service")
@RequiredArgsConstructor
public class ShopController {

    private final DiscoveryClient discoveryClient;

    @GetMapping(value = "/users")
    public String getProducts() {
        return "Meat, Vegetables, Milk, Eggs";
    }

    @GetMapping(value = "/shop-owners")
    public String getShopOwners() {
        return "";
    }
}
