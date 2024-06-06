package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_seq")

    @SequenceGenerator(name="user_seq", sequenceName="user_sequence", allocationSize=1)
  

	private int userId;
	private String userName;
	private String password;
	private String email;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Artwork>artworks;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Order1>orders;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Cart>carts; 

	public User() {
		super();
	}

	public User(int userId, String userName, String password, String email, List<Artwork> artworks, List<Order1> orders,
			List<Cart> carts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.artworks = artworks;
		this.orders = orders;
		this.carts = carts;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Artwork> getArtworks() {
		return artworks;
	}

	public void setArtworks(List<Artwork> artworks) {
		this.artworks = artworks;
	}

	public List<Order1> getOrders() {
		return orders;
	}

	public void setOrders(List<Order1> orders) {
		this.orders = orders;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	
	
	
	

}


