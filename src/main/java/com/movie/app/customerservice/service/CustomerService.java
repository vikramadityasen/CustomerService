/**
 * 
 */
package com.movie.app.customerservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.movie.app.customerservice.model.CustomerDetails;

/**
 * 
 * @author vickey
 *
 */
public interface CustomerService {

	List<CustomerDetails> getAllCustomerDetails();

	CustomerDetails getCustomerDetails(Integer custId);

	CustomerDetails saveCustomerDetails(CustomerDetails customerDetails);

	ResponseEntity<Object> updateCustomerDetails(CustomerDetails customerDetails, Integer custId);

}
