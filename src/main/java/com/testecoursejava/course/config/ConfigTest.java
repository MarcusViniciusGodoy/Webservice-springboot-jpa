package com.testecoursejava.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.testecoursejava.course.entities.Category;
import com.testecoursejava.course.entities.Order;
import com.testecoursejava.course.entities.User;
import com.testecoursejava.course.entities.enums.OrderStatus;
import com.testecoursejava.course.repositories.CategoryRepository;
import com.testecoursejava.course.repositories.OrderRepository;
import com.testecoursejava.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Marcus", "marcus@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Vinicius", "vinicius@gmail.com", "977777777", "654321"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.CANCELED, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	} 
}
