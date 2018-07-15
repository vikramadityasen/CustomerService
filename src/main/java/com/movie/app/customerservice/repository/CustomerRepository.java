/**
 * 
 */
package com.movie.app.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.app.customerservice.model.CustomerDetails;

/**
 * @author vickey
 *
 */
public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {

}
