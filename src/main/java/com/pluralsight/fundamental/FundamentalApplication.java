package com.pluralsight.fundamental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentalApplication {

	public static void main(String[] args) {

		SpringApplication.run(FundamentalApplication.class, args);
		System.out.println("#########learning spring boot###########");
	}
//here in line 11 we need to pass in FundamentalsApplication.class as an arguments to run the method
	//to identify the primary spring component here args array is also passed through to expose any
	//command line arguments.
}
//@SpringBootApplication bootstraps our application by starting spring
//typically it will create an instance of spring's application context, expose commandline
//arguments as spring properties, load  spring beans  etc