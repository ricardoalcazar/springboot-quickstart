package com.alcazar.spring.quickstart;

public class FortuneServiceImpl implements FortuneService{

    /* instance variables */
    private String fortune;

    /**
     * Default constructor
     */
    public FortuneServiceImpl(){
        this.fortune = "You will get lots of hawt ass!";
    }


    /**
     *
     */
    @Override
    public String getFortune() {
        return fortune;
    }
}
