package com.alcazar.spring.quickstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestApplication {


    public static void main(String[] args){

        // get applicationContext
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach c = appCtx.getBean("baseballCoach", BaseballCoach.class);
        System.out.println(c.getDailyWorkout());
        System.out.println(c.getFortune());

        c = appCtx.getBean("trackCoach", TrackCoach.class);
        System.out.println(c.getDailyWorkout());
        System.out.println(c.getFortune());

        TrackCoach tcCast = (TrackCoach)c;
        System.out.println("Casted email address: " + tcCast.getEmailAddress());

        TrackCoach tc = appCtx.getBean("trackCoach2", TrackCoach.class);
        System.out.println(tc.getDailyWorkout());
        System.out.println(tc.getFortune());
        System.out.println(tc.getEmailAddress());
        System.out.println(tc.getTeam());

        appCtx.close();

    }
}
