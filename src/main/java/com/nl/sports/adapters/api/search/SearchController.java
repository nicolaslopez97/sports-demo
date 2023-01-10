package com.nl.sports.adapters.api.search;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    @GetMapping
    public ResponseEntity<?> search(@RequestParam(value = "q") String query){
        System.out.println(query);
        return ResponseEntity.ok("Encontrado");
    }
}
