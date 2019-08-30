package com.demo.mvc;



import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Transactional
@Configuration
@EnableAutoConfiguration
//@EnableWebMvc
@ComponentScan({"com.demo.mvc"})
public class SpringHibTaskApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHibTaskApplication.class, args);
		
	}
}

