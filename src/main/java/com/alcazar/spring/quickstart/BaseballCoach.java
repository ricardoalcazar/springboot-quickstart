package com.alcazar.spring.quickstart;

public class BaseballCoach implements Coach{

    private String dailyWorkout;

    public BaseballCoach(){
        this.dailyWorkout = "Practice batting cages for 30mins.";
    }

    public void setDailyWorkout(String dailyWorkout) {
        this.dailyWorkout = dailyWorkout;
    }

    /**
     *
     */
    public String getDailyWorkout(){
        return dailyWorkout;
    }


}
