package com.alcazar.spring.quickstart;

public class TrackCoach implements Coach{

    /** instance variables */
    private String dailyWorkout;
    private FortuneService fs;
    private String emailAddr;
    private String team;

    /**
     * Default constructor
     */
    public TrackCoach(){
        this.dailyWorkout = new String();
        this.fs = null;
    }

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

    public FortuneService getFortuneService() {
        return fs;
    }

    public void setFortuneService(FortuneService fs) {
        this.fs = fs;
    }

    public String getEmailAddress() {
        return emailAddr;
    }

    public void setEmailAddress(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    public void init(){
        System.out.println("TrackCoach.init() Hitting that blonde pussy!");
    }

    public void destroy(){
        System.out.println("TrackCoach.destroy() Finishing that blonde.");
    }
}
