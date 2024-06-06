package com.controller;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.model.Artwork;
import com.service.ArtworkService;


@CrossOrigin(origins="http://localhost:4200")
@RestController

public class ArtworkController {            

	
	@Autowired
	ArtworkService artworkService; 
	
	@PostMapping("/addArtwork")
    public ResponseEntity<Artwork> addArtwork(@RequestParam("artworkTitle") String artworkTitle,
                                              @RequestParam("price") int price,
                                              @RequestParam("year") int year,
                                              @RequestParam("image") MultipartFile image) {
        try {
            Artwork artwork = new Artwork();
            artwork.setArtworkTitle(artworkTitle);
            artwork.setPrice(price);
            artwork.setYear(year);
            artwork.setImage(image.getBytes());
            Artwork savedArtwork = artworkService.addArtwork(artwork);
            return new ResponseEntity<>(savedArtwork, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}

	@GetMapping("/getAllArtworks")
	 public ResponseEntity<List<Artwork> >findAllArtwork()
	 {
	        List<Artwork> artworklist=artworkService.getAllArtworks();
	        return ResponseEntity.status(HttpStatus.OK).header("GET", "Artwork Found").body(artworklist);
	 }
	
	@PutMapping("/updateArtworks")
	  public ResponseEntity<String> updateArtwork(@RequestBody Artwork artwork) 
	 {
		    artworkService.updateArtwork(artwork);
	        return ResponseEntity.ok("Artwork updated successfully.");
	   }

	 @DeleteMapping("/deleteArtwork/{id}")
	 public ResponseEntity<String> deleteArtwork(@PathVariable int id) 
	 {
		 artworkService.deleteArtwork(id);
	     return ResponseEntity.ok("Artwork deleted successfully.");
	 }
	

}


