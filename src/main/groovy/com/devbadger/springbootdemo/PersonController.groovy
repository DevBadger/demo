package com.devbadger.springbootdemo

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import static org.springframework.web.bind.annotation.RequestMethod.*

/**
 * Created by Badger on 9/28/17.
 */
@RestController
@RequestMapping("api/v1/")
class PersonController {

    @RequestMapping(value = "people", method = GET)
    List<Person> get(){
        [new Person(), new Person()].asList()
    }

    @RequestMapping(value = "people/{id}", method = GET)
    Person get(@PathVariable Long id){
        new Person(id:id)
    }

    @RequestMapping(value = "people/{id}", method = POST)
    Person create(@PathVariable Long id, @RequestBody Person person){
        person.id = id
        person
    }

    @RequestMapping(value = "people/{id}", method = PUT)
    Person update(@PathVariable Long id){
        new Person(id:id)
    }

    @RequestMapping(value = "people/{id}", method = DELETE)
    Person delete(@PathVariable Long id){
        new Person(id:id)
    }
}
