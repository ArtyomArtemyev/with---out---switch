package com.art.service;

import com.art.entity.Person;
import com.art.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void add() {
        Person person = new Person();
        person.setName("Nick");
        person.setId(0L);
        personRepository.save(person);
    }
}
