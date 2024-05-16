package com.example.backendsp.service;

import com.example.backendsp.DAO.entities.Cart;
import com.example.backendsp.DAO.entities.Manga;
import com.example.backendsp.DAO.entities.User;

import java.util.List;
import java.util.Optional;

public interface CartServices {
    List<Cart> getAllCarts();

    Optional<Cart> getCartById(Long Id);

    Optional<Cart> findByUserId(Long userId);


//    Cart createCart(Cart cart);


    Cart addToCart(Cart cart);

    Cart updateCart(Long Id, Cart updatedCart);

    void deleteCart(Long Id);
}
