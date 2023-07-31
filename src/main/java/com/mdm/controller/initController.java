package com.mdm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdm.service.userSrv;

@Controller
public class initController {
	
	@Autowired
	userSrv UsrService;

	// this request is handled by WebSecurityConfig.class
//	@RequestMapping(value="/home")
//	public String helloApp() {
//		System.out.println("entra a hello");
//		
//		return "sayHello";
//	}
	
	@RequestMapping( value="/testuser" )
	public ResponseEntity<Object> test(){
		return new ResponseEntity<>( UsrService.testUser(), HttpStatus.OK );
	}
}
