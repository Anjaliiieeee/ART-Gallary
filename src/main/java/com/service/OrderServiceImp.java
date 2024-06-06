package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderRepository;
import com.model.Order1;

@Service

public class OrderServiceImp  implements OrderService {
	
	@Autowired
	OrderRepository orderRepo;


	@Override
	public Order1 addOrder(Order1 order) {
		return orderRepo.save(order);

	}

	@Override
	public Order1 getOrder(int id) {
		return  orderRepo.findById(id).orElse(null);
	}

	@Override
	public List<Order1> getAllOrder() {
		return orderRepo.findAll();
	}

	@Override
	public void updateOrder(Order1 order) {
		orderRepo.save(order);

	}

	@Override
	public void deleteOrder(int orderId) {
        orderRepo.deleteById(orderId);		

	}
	

}
