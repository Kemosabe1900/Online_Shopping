package com.example.CLproject.controllers;

import com.example.CLproject.models.CartItem;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import com.example.CLproject.services.CartService;

import java.util.List;

@RestController

@RequestMapping("/api/cart")

public class CartController {

    @Autowired
    private CartService cartService;


    @GetMapping
    public List<CartItem> getCartItems() {
        return cartService.getCartItems();

    }

    @PostMapping
    public void addToCart(@RequestBody CartItem cartItem) {
        cartService.addToCart(cartItem);

    }

    @DeleteMapping("/{id}")
    public void removeFromCart(@PathVariable Long id) {
        cartService.removeFromCart(id);
    }

}