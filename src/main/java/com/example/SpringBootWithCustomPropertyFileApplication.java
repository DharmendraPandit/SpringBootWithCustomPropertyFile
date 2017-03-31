package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
//@PropertySource(value="classpath:test.properties", ignoreResourceNotFound=false)
public class SpringBootWithCustomPropertyFileApplication {

	/*@Autowired
	private static Environment env;*/
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithCustomPropertyFileApplication.class, args);
		
		//System.out.println("&&&&&&&&& "+ env.getProperty("test.name"));
	}
	
	/*@Bean
	public CustomLoadProperty loadProperty(){
		return new CustomLoadProperty();
	}*/
	
	@Autowired
	private CustomLoadProperty property;
	
}
