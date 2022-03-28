package com.alcazar.spring.quickstart;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    /** instance variables */
    private String id;
    private String name;

    /**
     * Default constructor
     */
    public Greeting(){
        id = new String();
        name = new String();
    }

    /**
     * Default constructor
     * @param id
     * @param name
     */
    public Greeting(String id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getId(){
        return id;
    }

    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }




}
