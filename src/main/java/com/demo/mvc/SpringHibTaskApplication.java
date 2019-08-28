package com.demo.mvc;



import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Transactional
public class SpringHibTaskApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHibTaskApplication.class, args);
		
	}
}

