package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Artwork;

public interface ArtworkRepository  extends JpaRepository<Artwork, Integer> {

}
