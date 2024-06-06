package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepository;
import com.model.Admin;

@Service

public class AdminServiceImp implements AdminService{

	@Autowired
	AdminRepository adminRepo;

	
	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepo.save(admin);

	}

	@Override
	public List<Admin> getAllAdmins() {
		return adminRepo.findAll();

	}

	@Override
	public Admin getAdmin(int id) {
		return adminRepo.findById(id).orElse(null);

	}

	@Override
	public void deleteAdmin(int id) {
        adminRepo.deleteById(id);

	}

	@Override
	public void updateAdmin(Admin admin) {
		adminRepo.save(admin);

	}

}
