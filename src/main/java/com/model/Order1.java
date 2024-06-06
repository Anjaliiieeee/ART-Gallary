package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int orderId;
	private String name;
	private String details;
	private int quantity;
	private int amount;
	private int totalPrice;
	
	public Order1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order1(int orderId, String name, String details, int quantity, int amount, int totalPrice) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.details = details;
		this.quantity = quantity;
		this.amount = amount;
		this.totalPrice = totalPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	
}


