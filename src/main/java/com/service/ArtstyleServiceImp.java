package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ArtstyleRepository;
import com.model.Artstyle;

@Service

public class ArtstyleServiceImp implements ArtstyleService {

	
	@Autowired
	ArtstyleRepository artstyleRepo;

	
	@Override
	public Artstyle addArtstyle(Artstyle artstyle) {
		return artstyleRepo.save(artstyle);

	}

	@Override
	public List<Artstyle> getAllArtstyles() {
		return  artstyleRepo.findAll();

	}

	@Override
	public Artstyle updateArtstyle(Artstyle artstyle) {
		return  artstyleRepo.save(artstyle);
	}

	@Override
	public void deleteArtstyle(int styleId) {
		artstyleRepo.deleteById(styleId);

	}

	@Override
	public Artstyle getArtstyleById(int styleId) {
		return artstyleRepo.findById(styleId).orElse(null);

	}

}
