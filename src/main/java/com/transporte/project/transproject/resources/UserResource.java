package com.transporte.project.transproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.project.transproject.control.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource{
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","MARIA@GMAIL.COM","9999","13245","13231");
		return ResponseEntity.ok().body(u);
	}
}
