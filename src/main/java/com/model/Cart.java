package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	     @Id
		@GeneratedValue(strategy=GenerationType.AUTO)

	    private int cartId;
	    private int quantity;
	    
	    public Cart() {
	        // Default constructor
	    }

		public Cart(int cartId, int quantity) {
			super();
			this.cartId = cartId;
			this.quantity = quantity;
		}

		public int getCartId() {
			return cartId;
		}

		public void setCartId(int cartId) {
			this.cartId = cartId;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	   
	}



