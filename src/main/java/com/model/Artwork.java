package com.model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Artwork {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="artwork_seq")

	    @SequenceGenerator(name="artwork_seq", sequenceName="artwork_sequence", allocationSize=1)
	  

	    private int artworkId;
		private String artworkTitle;
		private int price;
		private int year;
		 @Lob
		 @Column(length=100000)
		    private byte[] image;
		 
		public Artwork() {
			super();
		}
		public Artwork(int artworkId, String artworkTitle, int price, int year, byte[] image) {
			super();
		this.artworkId = artworkId;
			this.artworkTitle = artworkTitle;
			this.price = price;
			this.year = year;
			this.image = image;
		}
		public int getArtworkId() {
		return artworkId;
		}
		public void setArtworkId(int artworkId) {
			this.artworkId = artworkId;
		}
		public String getArtworkTitle() {
			return artworkTitle;
		}
		public void setArtworkTitle(String artworkTitle) {
			this.artworkTitle = artworkTitle;
		}
		public int getPrice() {
		return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getYear() {
			return year;
		}
	public void setYear(int year) {
		this.year = year;
		}
		public byte[] getImage() {
			return image;
	}
		public void setImage(byte[] image) {
			this.image = image;
		}
		@Override
		public String toString() {
			return "Artwork [artworkId=" + artworkId + ", artworkTitle=" + artworkTitle + ", price=" + price + ", year="
					+ year + ", image=" + Arrays.toString(image) + "]";
	}
	 
	 		
}

