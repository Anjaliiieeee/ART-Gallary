package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ArtistRepository;
import com.model.Artist;

@Service

public class ArtistServiceImp implements ArtistService{

	@Autowired
	ArtistRepository artistRepo;
	
	
	@Override
	public Artist addArtist(Artist artist) {
		return artistRepo.save(artist);

	}

	@Override
	public List<Artist> getAllArtists() {
		return artistRepo.findAll();
	}

	@Override
	public Artist getArtistById(int id) {
		return artistRepo.findById(id).orElse(null);

	}

	@Override
	public Artist updateArtist(Artist artist) {
		return artistRepo.save(artist);

	}

	@Override
	public void deleteArtist(int id) {
        artistRepo.deleteById(id);

	}

}
