package com.khata.service.controllers;

import com.khata.service.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {

    @Autowired
    TestRepository testRepository;

    @RequestMapping("/")
    public String testMethod(){
        System.out.println(testRepository.findAll());
        System.out.println(testRepository.findById(1));
        System.out.println(testRepository.findByName("abc"));
        System.out.println(testRepository.findByNameAndDescription("abc","test description5"));
        return "Test com.khata.service.Application called Successfully";
    }
}
