package com.ua.nuweb.controllers;

import com.ua.nuweb.models.Person;
import com.ua.nuweb.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {

    final
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/createNewPerson")
    ResponseEntity<Person> createNewPerson(@RequestBody Person person) {
        personService.createNewPerson(person);
        return new ResponseEntity<>(person, null, HttpStatus.CREATED);
    }

    @GetMapping("/listAllPeople")
    List<?> listAllPeople () {
        return personService.listAllPeople();
    }

    @GetMapping("/teste")
    String teste() {
        return "Tá funcionando em!";
    }

}
