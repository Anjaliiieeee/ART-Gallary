package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartRepository;
import com.model.Cart;

@Service

public class CartServiceImp implements CartService {
	
	@Autowired
	CartRepository cartRepo;


	@Override
	public Cart addCart(Cart cart) {
		return cartRepo.save(cart);

	}

	@Override
	public Cart getCart(int id) {
		return cartRepo.findById(id).orElse(null);

	}

	@Override
	public List<Cart> getAllCart() {
		return cartRepo.findAll();

	}

	@Override
	public void updateCart(Cart cart) {
        cartRepo.save(cart);		

	}

	@Override
	public void deleteCart(int cartId) {
      	cartRepo.deleteById(cartId);	

	}

}
