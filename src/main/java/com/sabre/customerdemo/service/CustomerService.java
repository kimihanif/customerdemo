package com.sabre.customerdemo.service;

import com.sabre.customerdemo.domain.Customer;
import com.sabre.customerdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> getCustomerData(Long id) {
        if(id != null) {
            return customerRepository.findById(id);
        } else {
           return Optional.empty();
        }
    }

    public Customer addCustomerData(Customer customer) {
        return customerRepository.save(customer);
    }
}
