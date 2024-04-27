package com.redweber.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person addPerson(Person data) {
        return personRepository.save(data);
    }

    public Person findPersonByMobileNumber(String mobileNumber) {
        return personRepository.findByMobileNumber(mobileNumber);
    }
}
