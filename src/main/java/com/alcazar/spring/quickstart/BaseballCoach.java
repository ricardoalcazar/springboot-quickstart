package com.alcazar.spring.quickstart;

public class BaseballCoach implements Coach{


    /** instance variables */
    private String dailyWorkout;
    private FortuneService fortuneService;

    /**
     * Default constructor
     * @param fs The <class>FortuneService</class> provided by Spring container.
     */
    public BaseballCoach(FortuneService fs){
        this.dailyWorkout = "Practice batting cages for 30mins.";
        this.fortuneService = fs;
    }

    /**
     * Set method that sets the daily workout string returned by the <class>BaseballCoach</class>.
     * This is set in the Spring container.
     * @param dailyWorkout
     */
    public void setDailyWorkout(String dailyWorkout) {
        this.dailyWorkout = dailyWorkout;
    }

    /**
     * Returns the daily workout provided by the <class>BaseballCoach</class>.
     * @return A string object.
     */
    public String getDailyWorkout(){
        return dailyWorkout;
    }

    /**
     * Returns the fortune from the <class>FortuneService</class>.
     * @return A string object
     */
    public String getFortune(){
        return fortuneService.getFortune();
    }


}
