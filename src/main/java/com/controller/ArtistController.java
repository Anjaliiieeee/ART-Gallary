package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Artist;
import com.service.ArtistService;

@CrossOrigin(origins="http://localhost:4200")

@RestController
public class ArtistController {
	
	@Autowired
	ArtistService artistService; 
	
	@PostMapping ("/addArtist")
	public ResponseEntity<Artist>addArtist(@RequestBody Artist artist)
	{
		Artist art=artistService.addArtist(artist);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add","Artist Created").body(art);
		
	}
	 @GetMapping("/getallArtist")
	    public ResponseEntity<List<Artist>> getAllArtists() {
	        List<Artist> artists = artistService.getAllArtists();
	        return ResponseEntity.ok(artists);
	    }
	 
	 @GetMapping("/getArtistById/{id}")
	    public ResponseEntity<Artist> getArtistById(@PathVariable("id") int id) {
	        Artist artist = artistService.getArtistById(id);
	        if (artist != null) {
	            return ResponseEntity.ok(artist);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	 @PutMapping("/updateArtist")
	    public ResponseEntity<String> updateArtist(@RequestBody Artist artist) {
		 artistService.updateArtist(artist);
	        return ResponseEntity.ok("Artist updated successfully.");
	    }
	 
	 @DeleteMapping("/deleteArtist/{id}")
	    public ResponseEntity<Void> deleteArtist(@PathVariable("id") int id) {
	        artistService.deleteArtist(id);
	        return ResponseEntity.noContent().build();
	    }
}

