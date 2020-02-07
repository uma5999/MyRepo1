package com.quadrant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quadrant.DB.CutomerRepo;
import com.quadrant.model.Customer;

@RestController
@RequestMapping("/demo")
public class MyController {

	@Autowired
	private CutomerRepo repo;

	@GetMapping("/saveCustomer")
	public String saveCustomer() {
		Customer customer1 = new Customer(101, "uma");
		Customer customer2 = new Customer(102, "mahesh");
		Customer customer3 = new Customer(103, "rao");
		Customer customer4 = new Customer(104, "guma");
		Customer customer5 = new Customer(105, "maheshwar");
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		repo.saveAll(customers);
		return "saved";

	}

	@GetMapping("/getall")
	public List<Customer> getAll() {
		return repo.findAll();
	}

}
