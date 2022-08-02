package com.guner.customer.service;

import com.guner.customer.dto.CustomerRegistrationRequest;
import com.guner.customer.entity.Customer;
import com.guner.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().
                firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        //todo: check if email valid
        //todo: check if email not taken
        //todo: store customer in db
        customerRepository.save(customer);
    }
}


