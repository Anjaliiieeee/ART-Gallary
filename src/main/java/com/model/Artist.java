package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Artist {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int artistId;
	private String artistName;
	private String artistBio;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Artwork>artwork;

	public Artist() {
		super();
	}

	public Artist(int artistId, String artistName, String artistBio, List<Artwork> artwork) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.artistBio = artistBio;
		this.artwork = artwork;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getArtistBio() {
		return artistBio;
	}

	public void setArtistBio(String artistBio) {
		this.artistBio = artistBio;
	}

	public List<Artwork> getArtwork() {
		return artwork;
	}

	public void setArtwork(List<Artwork> artwork) {
		this.artwork = artwork;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + ", artistBio=" + artistBio + ", artwork="
				+ artwork + "]";
	}
	

}
