package com.spring.guru.service;

import com.spring.guru.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID id);
}
