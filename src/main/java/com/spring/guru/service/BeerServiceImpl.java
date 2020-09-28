package com.spring.guru.service;

import com.spring.guru.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeer(UUID beerId) {
        return BeerDTO.builder().id(beerId).brewName("Beer Name").brewStyle("Beer style").build();
    }
}
