package com.test;

import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadWebStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadWebStreamApplication.class, args);
		try {
			ExampleClient.main(args);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
