package com.alcazar.spring.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting requestGreeting(@RequestParam(value="id", defaultValue="-1") String id, @RequestParam(value="name", defaultValue="dafuq") String name){
        return new Greeting(id, name);
    }



}
