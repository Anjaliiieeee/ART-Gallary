package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ArtworkRepository;
import com.model.Artwork;

@Service

public class ArtworkServiceImp implements ArtworkService {

	

	@Autowired
	ArtworkRepository artworkRepo;

	
	@Override
	public Artwork addArtwork(Artwork artwork) {
		return artworkRepo.save(artwork);

	}

	@Override
	public List<Artwork> getAllArtworks() {
		return artworkRepo.findAll();

	}

	@Override
	public Artwork getArtwork(int id) {
		return artworkRepo.findById(id).orElse(null);

	}

	@Override
	public void updateArtwork(Artwork artwork) {
        artworkRepo.save(artwork);		

	}

	@Override
	public void deleteArtwork(int artworkId) {
        artworkRepo.deleteById(artworkId);		

	}

	@Override
	public Artwork getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

//	@Override
//	public Artwork getById(int id) {
//		return null;
//	}
//
}
