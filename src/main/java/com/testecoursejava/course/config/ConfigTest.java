package com.testecoursejava.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.testecoursejava.course.entities.User;
import com.testecoursejava.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Marcus", "marcus@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Vinicius", "vinicius@gmail.com", "977777777", "654321"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
