package com.sabre.customerdemo.repository;

import com.sabre.customerdemo.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
