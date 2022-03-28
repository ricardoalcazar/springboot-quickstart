package com.alcazar.spring.quickstart;

public class TrackCoach implements Coach{

    /** instance variables */
    private String dailyWorkout;

    /**
     * Default constructor
     */

    public TrackCoach(String dailyWorkout){
        this.dailyWorkout = dailyWorkout;
    }

    public void setDailyWorkout(String dailyWorkout) {
        this.dailyWorkout = dailyWorkout;
    }

    public String getDailyWorkout(){
        return dailyWorkout;
    }

}
