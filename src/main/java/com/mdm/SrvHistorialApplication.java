package com.mdm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class SrvHistorialApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SrvHistorialApplication.class, args);
	}
	
	@Value("${spring.application.myapp}")
	private String NameApp;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		System.out.println("init of application...");
		System.out.println("application name: "+NameApp);
	}

}
