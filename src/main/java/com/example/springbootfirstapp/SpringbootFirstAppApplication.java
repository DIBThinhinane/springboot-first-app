package com.example.springbootfirstapp;

import com.example.springbootfirstapp.entity.Equipment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootFirstAppApplication {

	public static void sayHello(String name){
		System.out.println("hello "+name);
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
		sayHello("Thinhinane");
		Equipment e = new Equipment("equi1",null);
		sayHello(e.getName());

	}


}
