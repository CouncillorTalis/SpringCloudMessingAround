package com.talis.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user-service")
public class UserController {

    @GetMapping(value = "/users")
    public String getUsers() {
        return "Jason";
    }

    @GetMapping(value = "/shop-owners")
    public String getShopOwners() {
        return "Jason, Jibber, Jabber";
    }
}
