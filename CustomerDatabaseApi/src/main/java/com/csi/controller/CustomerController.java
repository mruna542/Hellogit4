package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Customer;
import com.csi.service.CustomerDao;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	CustomerDao customerdao;
	//syso
	

	@GetMapping("/getdata")
	public List<Customer> getCustomerData() {
		List<Customer> customerList = customerdao.getCustomerDetails();
		return customerList;
	}

	@PostMapping("/savedata")
	public String saveCustomerData(@RequestBody Customer customer) {

		System.out.println("customer name: " + customer.getCustomerName());
		customerdao.saveCustomerDetails(customer);
		return "save succesfully";
	}

	@PutMapping("/updatecustomerDao/{CustomerId}")
	public String updateCustomerData(@PathVariable("CustomerId") int CustomerId, @RequestBody Customer customer) {
		customerdao.updateCustomerDetails(customer, CustomerId);
		return "update successfully";

	}

	@DeleteMapping("/deletecustomerData/{CustomerId}")
	public String deleteCustomerData(@PathVariable("CustomerId") int CustomerId) {
		customerdao.deleteCustomerDetails(CustomerId);

		return "deleted successfully";

	}
}
