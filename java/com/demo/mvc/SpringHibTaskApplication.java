package com.demo.mvc;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@Configuration
@EnableWebMvc
@ComponentScan({"com.demo.mvc"})
public class SpringHibTaskApplication extends WebMvcConfigurerAdapter {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHibTaskApplication.class, args);
		
	}
}

