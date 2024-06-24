package com.example.CLproject.services;
import com.example.CLproject.daos.CartItemRepository;
import com.example.CLproject.models.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CartService {

    @Autowired

    private CartItemRepository cartItemDAO;

    public List<CartItem> getCartItems() {
        return cartItemDAO.findAll();
    }

    public void addToCart(CartItem cartItem) {
        cartItemDAO.save(cartItem);
    }

    public void removeFromCart(Long id) {
        cartItemDAO.deleteById(id);
    }

}