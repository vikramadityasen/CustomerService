/**
 * 
 */
package com.movie.app.customerservice.service;

import java.util.List;

import com.movie.app.customerservice.model.CustomerDetails;

/**
 * 
 * @author vickey
 *
 */
public interface CustomerService {

	List<CustomerDetails> getAllCustomerDetails();

	CustomerDetails getCustomerDetails(Integer custId);

}
