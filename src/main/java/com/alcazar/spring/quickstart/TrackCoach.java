package com.alcazar.spring.quickstart;

public class TrackCoach implements Coach{

    /** instance variables */
    private String dailyWorkout;
    private FortuneService fs;

    /**
     * Default constructor
     */

    public TrackCoach(String dailyWorkout, FortuneService fs){
        this.dailyWorkout = dailyWorkout;
        this.fs = fs;
    }

    public void setDailyWorkout(String dailyWorkout) {
        this.dailyWorkout = dailyWorkout;
    }

    public String getDailyWorkout(){
        return dailyWorkout;
    }

    public String getFortune(){
        return fs.getFortune();
    }

}
