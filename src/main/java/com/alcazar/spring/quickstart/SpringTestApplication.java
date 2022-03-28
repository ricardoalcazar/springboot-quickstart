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

        appCtx.close();


    }
}
