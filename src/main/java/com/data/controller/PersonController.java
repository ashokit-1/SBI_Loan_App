package com.data.controller;

import com.data.payload.PersonDto;
import com.data.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<PersonDto> createPerson(@RequestBody PersonDto personDto) {
        PersonDto dto = personService.createPerson(personDto); // Assuming personService returns PersonDto
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    public void data (){
        
        int x = 500;
        System.out.println(x);
        
    }

    // You can define other CRUD operations endpoints here (GET, PUT, DELETE, etc.)
}
