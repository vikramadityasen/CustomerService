/**
 * 
 */
package com.movie.app.customerservice.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.customerservice.model.CustomerDetails;
import com.movie.app.customerservice.service.CustomerService;

/**
 * @author vickey
 *
 */
@RequestMapping("/customer")
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/getAllCustomerDetails")
	public List<CustomerDetails> getAllCustomerDetails() {
		return customerService.getAllCustomerDetails();
	}

	@GetMapping("/getCustomerDetails/{custId}")
	public CustomerDetails getCustomerDetails(@PathVariable Integer custId) {
		return customerService.getCustomerDetails(custId);
	}
	
	@PostMapping("/saveCustomerDetails")
	public CustomerDetails saveCustomerDetails(@RequestBody CustomerDetails customerDetails) {
		return customerService.saveCustomerDetails(customerDetails);
	}
	
	@PutMapping("/updateCustomerDetails/{custId}")
	public ResponseEntity<Object> updateCustomerDetails(@RequestBody CustomerDetails customerDetails, @PathVariable Integer custId ){
		return customerService.updateCustomerDetails(customerDetails,custId);
	}
}
