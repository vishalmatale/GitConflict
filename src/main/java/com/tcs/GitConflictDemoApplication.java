package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitConflictDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitConflictDemoApplication.class, args);
	}
	
	public void m1() {
		
		System.out.println("future- 01 method");
		
	}
	

}
