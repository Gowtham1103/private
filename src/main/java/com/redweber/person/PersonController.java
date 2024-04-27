package com.redweber.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/post-person")
    public Person addPerson(@RequestBody Person data) {
        return personService.addPerson(data);
    }

    @GetMapping("/find-person/{mobileNumber}")
    public ResponseEntity<Person> findPersonByMobileNumber(@PathVariable String mobileNumber) {
        Person person = personService.findPersonByMobileNumber(mobileNumber);
        if (person != null) {
            return ResponseEntity.ok(person);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
