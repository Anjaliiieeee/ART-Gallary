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

import com.model.Order1;
import com.service.OrderService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping ("/addOrder")
	public ResponseEntity<Order1>addOrder(@RequestBody Order1 order)
	{
		Order1 order1=orderService.addOrder(order);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add","Order Created").body(order1);
		
	}
	
	@GetMapping("/getOrders/{id}")
	public Order1 getOrder(@PathVariable("id")int id)
	{
		return orderService.getOrder(id);
		
	}
	
	@GetMapping("/getAllOrders")
	 public List<Order1> getAllOrder()
	 {
	        List<Order1> orderlist=orderService.getAllOrder();
	        return orderlist;
	 }

	 @PutMapping("/updateOrder")
	  public ResponseEntity<String> updateOrder(@RequestBody Order1 order) 
	 {
		    orderService.updateOrder(order);
	        return ResponseEntity.ok("Order updated successfully.");
	   }

	 @DeleteMapping("/deleteOrder/{id}")
	 public ResponseEntity<String> deleteOrder(@PathVariable int id) 
	 {
		 orderService.deleteOrder(id);
	     return ResponseEntity.ok("Order deleted successfully.");
	 }
	


}

