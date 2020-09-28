package com.spring.guru.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data // Genrates getters and setters for variables defined - lombok
@NoArgsConstructor // Generates constructor with no arguments
@AllArgsConstructor //Generates constructor with all arguments
@Builder // Builds a builder pattern
public class BeerDTO {
    private UUID id;
    private String brewName;
    private String brewStyle;
    private Long upc;
}
