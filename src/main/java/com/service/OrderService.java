package com.service;

import java.util.List;

import com.model.Order1;

public interface OrderService {
	
    public Order1 addOrder(Order1 order);
	
	Order1 getOrder(int id);
	
    List<Order1> getAllOrder();
    
    void updateOrder(Order1 order);
    
    void deleteOrder(int orderId);


}
