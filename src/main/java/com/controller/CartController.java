package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Cart;
import com.service.CartService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CartController {
	@Autowired
	CartService cartService; 
	
	@PostMapping ("/addCart")
	public ResponseEntity<Cart>addCart(@RequestBody Cart cart)
	{
		Cart cart1=cartService.addCart(cart);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add","Cart Created").body(cart1);
		
	}
	
	
	@GetMapping("/getCart/{id}")
	public Cart getCard(@PathVariable("id")int id)
	{
		return cartService.getCart(id);
		
	}
	
	@GetMapping("/getAllCarts")
	 public List<Cart> getAllCart()
	 {
	        List<Cart> cartlist=cartService.getAllCart();
	        return cartlist;
	 }

	 @PutMapping("/updateCarts")
	  public ResponseEntity<String> updateCart(@RequestBody Cart cart) 
	 {
		    cartService.updateCart(cart);
	        return ResponseEntity.ok("Cart updated successfully.");
	   }

	 @DeleteMapping("/deleteCart/{id}")
	 public ResponseEntity<String> deleteCart(@PathVariable int id) 
	 {
		 cartService.deleteCart(id);
	     return ResponseEntity.ok("Cart deleted successfully.");
	 }
	

}

