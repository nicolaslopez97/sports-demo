package com.nl.sports.adapters.api.search.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SearchRequestDto {
    @NotEmpty(message = "La query no puede estar vacia")
    private String query;
}
