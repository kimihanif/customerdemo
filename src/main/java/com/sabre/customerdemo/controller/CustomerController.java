package com.sabre.customerdemo.controller;

import com.sabre.customerdemo.domain.Customer;
import com.sabre.customerdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getCustomer")
    public Optional<Customer> getCustomerDetail(@RequestParam(value = "id") Long id) {
        return customerService.getCustomerData(id);
    }

    @PostMapping("/addCustomer")
    public Customer addCustomerDetail(@RequestBody Customer customer) {
        return customerService.addCustomerData(customer);
    }
}
