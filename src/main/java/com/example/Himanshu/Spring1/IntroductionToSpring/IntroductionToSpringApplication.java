package com.example.Himanshu.Spring1.IntroductionToSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringApplication  implements CommandLineRunner {

//	@Autowired
//	Apple obj;
	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		obj.eatApple();
		System.out.println(dbService.getData());
	}
}
