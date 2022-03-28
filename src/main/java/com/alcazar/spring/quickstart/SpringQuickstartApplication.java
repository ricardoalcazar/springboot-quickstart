package com.alcazar.spring.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringQuickstartApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringQuickstartApplication.class, args);
		GreetingController controller = new GreetingController();
		//QuickstartCustomController controller = new QuickstartCustomController();

		// get applicationContext
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach c = (Coach)appCtx.getBean("baseballCoach");
		System.out.println(c.getDailyWorkout());


	}



}
