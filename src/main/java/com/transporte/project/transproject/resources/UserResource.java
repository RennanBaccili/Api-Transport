package com.transporte.project.transproject.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.project.transproject.control.User;
import com.transporte.project.transproject.services.UserService;


//camada de resource recebe a camada de service

@RestController
@RequestMapping(value = "/user")
public class UserResource{
	
	@Autowired
	private UserService service;
	
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> users = service.findAll();
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<User>> findbyID(@PathVariable Long id){
		Optional<User> user = service.findbyId(id);
		return ResponseEntity.ok().body(user);
	}
}
