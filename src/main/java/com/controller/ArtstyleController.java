package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Artstyle;
import com.service.ArtstyleService;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ArtstyleController {
	
	@Autowired
	ArtstyleService artstyleService;
	
	@PostMapping("/addArtstyle")
	public Artstyle addArtstyle(@RequestBody Artstyle artstyle)
	{
		System.out.println(artstyle);
		return artstyleService.addArtstyle(artstyle);
	}
	
	@GetMapping("/getAllArtstyle")
    public ResponseEntity<List<Artstyle>> getAllArtstyles() {
        List<Artstyle> artstyles = artstyleService.getAllArtstyles();
        return ResponseEntity.ok(artstyles);
    }
	
	@PutMapping("/updateArtstyle")
    public ResponseEntity<String> updateArtstyle(@RequestBody Artstyle artstyle) {
		artstyleService.updateArtstyle(artstyle);
        return ResponseEntity.ok("Artstyle updated successfully.");
    }
	 @DeleteMapping("/deleteArtstyle/{id}")
	    public ResponseEntity<Void> deleteArtstyle(@PathVariable("id") int id) {
	        artstyleService.deleteArtstyle(id);
	        return ResponseEntity.noContent().build();
	    }
	 
	 @GetMapping("/getArtstyleById/{id}")
	    public ResponseEntity<Artstyle> getArtstyleById(@PathVariable("id") int id) {
	        Artstyle artstyle = artstyleService.getArtstyleById(id);
	        if (artstyle != null) {
	            return ResponseEntity.ok(artstyle);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
}


