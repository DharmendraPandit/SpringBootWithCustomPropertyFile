package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource(value="classpath:test.properties", ignoreResourceNotFound=false)
@PropertySource(value={"classpath:test.properties"})
//@RestController
public class CustomLoadProperty {

	@Autowired
	private Environment env;
	
	@Value("${test.name}")
	private String name;
	
	
	
	public CustomLoadProperty(){
		System.out.println("######### name: "+ name);
		
		System.out.println("test.name : "+ env.getProperty("test.name"));
		System.out.println("test.age : "+ env.getProperty("test.age"));
	}
	
	/*@RequestMapping("/")
	public String loadProperty(){
		
		System.out.println("test.name : "+ env.getProperty("test.name"));
		System.out.println("test.age : "+ env.getProperty("test.age"));
		
		System.out.println("######### name: "+ name);
		return "success";
	}*/
}
