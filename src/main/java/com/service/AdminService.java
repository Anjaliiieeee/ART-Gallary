package com.service;

import java.util.List;

import com.model.Admin;

public interface AdminService {
	
     Admin addAdmin(Admin admin);
	
     List<Admin> getAllAdmins();

	Admin getAdmin(int id);
	
	 void deleteAdmin(int id);
	 void updateAdmin(Admin admin);


}
