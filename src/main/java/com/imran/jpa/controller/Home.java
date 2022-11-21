package com.imran.jpa.controller;

import com.imran.jpa.entity.Persons;
import com.imran.jpa.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @Autowired
    private PersonsService personsService;

    @GetMapping("/")
    public String name(String address){
        Persons persons=personsService.getData(address);
        return " "+persons;
    }
    @GetMapping("/insert")
    public String name(){
        personsService.insertData();
        return "inserted";
    }
}
