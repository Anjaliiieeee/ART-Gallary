package com.service;

import java.util.List;

import com.model.Artist;

public interface ArtistService {
	

	public Artist addArtist(Artist artist);
	
    List<Artist> getAllArtists();
    
    Artist getArtistById(int id);
    
    Artist updateArtist( Artist artist);
    
    void deleteArtist(int id);


}
