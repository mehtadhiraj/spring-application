package com.spring.guru.service;

import com.spring.guru.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeer(UUID beerId);
    BeerDTO saveNewBeer(BeerDTO beerDetails);
    void updateBeerById(UUID beerId);
}
