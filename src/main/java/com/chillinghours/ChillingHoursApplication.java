package com.chillinghours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("/")
@ComponentScan("src/main/java/com/chillinghours/ChillingHours/Contoller/NOAAChillingHoursController.java")
@ComponentScan("src/main/java/com/chillinghours/Trees/TreeController.java")
@ComponentScan("src/main/java/com/chillinghours/ChillingHours/Locations/LocationController.java")
@ComponentScan("src/main/java/com/chillinghours/Maps/MapController.java")
@ComponentScan("src/main/java/com/chillinghours/User/UserController.java")

public class ChillingHoursApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChillingHoursApplication.class, args);
	}

}
