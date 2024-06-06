package com.service;

import java.util.List;

import com.model.Cart;

public interface CartService {
	

	public Cart addCart(Cart cart);
	Cart getCart(int id);
    List<Cart> getAllCart();
    
    void updateCart(Cart cart);
    
    void deleteCart(int cartId);


}
