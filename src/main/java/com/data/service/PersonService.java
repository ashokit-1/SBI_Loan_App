package com.data.service;

import com.data.entity.Person;
import com.data.payload.PersonDto;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    public PersonDto createPerson(PersonDto personDto);

    List<Person> getAllPersons();

    Optional<Person> getPersonById(Long id);

    Person createPerson(Person person);
}
