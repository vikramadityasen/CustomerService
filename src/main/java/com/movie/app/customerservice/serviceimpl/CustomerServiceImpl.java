/**
 * 
 */
package com.movie.app.customerservice.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.movie.app.customerservice.model.CustomerDetails;
import com.movie.app.customerservice.repository.CustomerRepository;
import com.movie.app.customerservice.service.CustomerService;

/**
 * @author vickey
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<CustomerDetails> getAllCustomerDetails() {
		return customerRepository.findAll();
	}

	@Override
	public CustomerDetails getCustomerDetails(Integer custId) {
		Optional<CustomerDetails> customerDetails = customerRepository.findById(custId);
		if (!customerDetails.isPresent())
			try {
				throw new NotFoundException();
			} catch (NotFoundException e) {
				e.printStackTrace();
			}
		return customerDetails.get();
	}

	@Override
	public CustomerDetails saveCustomerDetails(CustomerDetails customerDetails) {
		return customerRepository.save(customerDetails);
	}

	@Override
	public ResponseEntity<Object> updateCustomerDetails(CustomerDetails customerDetails, Integer custId) {
		Optional<CustomerDetails> customerDetail=customerRepository.findById(custId);
		if(!customerDetail.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		customerDetails.setCustId(custId);
		customerRepository.save(customerDetails);
		return ResponseEntity.ok(customerDetail);
	}

}
