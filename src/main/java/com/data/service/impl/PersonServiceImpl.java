package com.data.service.impl;

import com.data.entity.Person;
import com.data.payload.PersonDto;
import com.data.repository.PersonRepository;
import com.data.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepo;




    @Override
    public PersonDto createPerson(PersonDto personDto) {

        Person person = new Person();
        person.setName(personDto.getName());
        person.setAge(personDto.getAge());
        person.setCity(personDto.getCity());

        personRepo.save(person);

        return personDto;

    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return Optional.empty();
    }

    @Override
    public Person createPerson(Person person) {
        return null;
    }
}
