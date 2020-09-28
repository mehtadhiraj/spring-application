package com.spring.guru.controller;

import com.spring.guru.model.BeerDTO;
import com.spring.guru.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/brew")
@RestController
public class BeerController {
    @Autowired
    public BeerService beerService;

    @GetMapping("/{beerId}")
    @ResponseStatus(HttpStatus.OK)
    public BeerDTO getBeer(@PathVariable("beerId") UUID beerId){
        return beerService.getBeer(beerId);
    }

    @PostMapping(value = "/savebeer", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<BeerDTO> saveBeer(@ModelAttribute BeerDTO beerDetails){
        System.out.println(beerDetails);
        BeerDTO newBear = beerService.saveNewBeer(beerDetails);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/savebeer"+newBear.getId().toString());
        return new ResponseEntity(newBear, headers, HttpStatus.CREATED);
    }

    @PutMapping("/updatebeer/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDTO beerDetails){
        beerService.updateBeerById(beerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
