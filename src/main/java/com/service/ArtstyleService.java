package com.service;

import java.util.List;

import com.model.Artstyle;

public interface ArtstyleService {

     Artstyle addArtstyle(Artstyle artstyle);
	
	List<Artstyle> getAllArtstyles();
	
    Artstyle updateArtstyle(Artstyle artstyle);
    
    void deleteArtstyle(int styleId);
    
    Artstyle getArtstyleById(int styleId);

}
