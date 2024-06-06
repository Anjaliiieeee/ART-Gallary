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

import com.model.Admin;
import com.service.AdminService;

@CrossOrigin(origins="http://localhost:4200")

@RestController
public class AdminController {

	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin)
	{
		System.out.println(admin);
		return adminService.addAdmin(admin);

	}
	  @GetMapping("/getAllAdmins")
	    public List<Admin> getAllAdmins() {
	        return adminService.getAllAdmins();
	    }


	@GetMapping("/getAdmin/{id}")
	public Admin getAdmin(@PathVariable("id")int id)
	{
		return adminService.getAdmin(id);
		
	}

    @DeleteMapping("/delete/{adminId}")
    public ResponseEntity<String> deleteAdmin(@PathVariable int adminId) {
        adminService.deleteAdmin(adminId);
        return ResponseEntity.ok("Admin deleted successfully.");
        
    }
    @PutMapping("/updateAdmin")
    public ResponseEntity<String> updateAdmin(@RequestBody Admin admin) {
    	adminService.updateAdmin(admin);
        return ResponseEntity.ok("Admin updated successfully.");
    }
}



