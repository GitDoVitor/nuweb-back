package com.ua.nuweb.services;

import com.ua.nuweb.models.Person;
import com.ua.nuweb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    final
    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createNewPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> listAllPeople() {
        return personRepository.findAll();
    }
}
