package com.service;

import java.util.List;

import com.model.Artwork;

public interface ArtworkService {

	public Artwork addArtwork(Artwork artwork);
	List<Artwork> getAllArtworks();
	Artwork getArtwork(int id);
	
    void updateArtwork(Artwork artwork);
    
    void deleteArtwork(int artworkId);

    Artwork getById(int id);

}
