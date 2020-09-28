package com.spring.guru.controller;

import com.spring.guru.model.CustomerDTO;
import com.spring.guru.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @GetMapping("/{customerId}")
    public CustomerDTO getCustomer(@PathVariable("customerId")UUID customerId){
        CustomerDTO customerDTO = customerService.getCustomerById(customerId);
        return customerDTO;
    }
}
