package com.alcazar.spring.quickstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args){
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach = appCtx.getBean("trackCoach",com.alcazar.spring.quickstart.TrackCoach.class);
        Coach alphaCoach = appCtx.getBean("trackCoach",com.alcazar.spring.quickstart.TrackCoach.class);

        System.out.println("Same object: " + (theCoach == alphaCoach));

        appCtx.close();

    }
}
