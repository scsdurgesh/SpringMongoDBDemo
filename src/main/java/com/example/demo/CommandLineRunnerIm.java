package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerIm implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Customer("1", "xyz", 100D));
		repository.save(new Customer("2", "pqr", 100D));
		repository.save(new Customer("3", "asd", 100D));
		repository.findAll().forEach(System.out::println);
	}

}
