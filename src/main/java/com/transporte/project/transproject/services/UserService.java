package com.transporte.project.transproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.project.transproject.control.User;
import com.transporte.project.transproject.repositories.UserRepository;

//camada de serviço se comunica com a interface repository
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public Optional<User> findbyId(Long id) {
		return repository.findById(id);
	}
}
