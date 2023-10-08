package com.transporte.project.transproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.transporte.project.transproject.barCode.BufferedImage;
import com.transporte.project.transproject.control.User;
import com.transporte.project.transproject.repositories.UserReposiroty;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired			
	private UserReposiroty userRepository;

	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", "1367000");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", "1367000"); 
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
