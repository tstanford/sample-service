package com.timstanford.sampleService.controllers;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "health")
public class SampleController {

    private final ObjectIdGenerators.UUIDGenerator uuidGenerator;
    private final String id;

    public SampleController() {
        uuidGenerator = new ObjectIdGenerators.UUIDGenerator();
        id = uuidGenerator.generateId(this).toString();
    }

    @GetMapping
    public String getSampleData(){
        return "Hello world, i am instance "+id;
    }
}
