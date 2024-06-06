package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Admin {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String name;
	private String password;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Artwork>artworks;
	
	@OneToMany(fetch=FetchType.EAGER)
    private List<Artstyle>Artstyles;
	
	@OneToMany(fetch=FetchType.EAGER)
    private List<Order1>orders;
	
	@OneToMany(fetch=FetchType.EAGER)
    private List<Cart>carts;
	
	@OneToMany(fetch=FetchType.EAGER)
    private List<Artist>artists;
	
	

	public Admin() {
		super();
	}



	public Admin(int id, String name, String password, List<Artwork> artworks, List<Artstyle> artstyles,
			List<Order1> orders, List<Cart> carts, List<Artist> artists) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.artworks = artworks;
		Artstyles = artstyles;
		this.orders = orders;
		this.carts = carts;
		this.artists = artists;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<Artwork> getArtworks() {
		return artworks;
	}



	public void setArtworks(List<Artwork> artworks) {
		this.artworks = artworks;
	}



	public List<Artstyle> getArtstyles() {
		return Artstyles;
	}



	public void setArtstyles(List<Artstyle> artstyles) {
		Artstyles = artstyles;
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



	public List<Artist> getArtists() {
		return artists;
	}



	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	


}
