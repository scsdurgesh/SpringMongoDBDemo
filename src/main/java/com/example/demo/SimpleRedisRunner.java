package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SimpleRedisRunner implements CommandLineRunner {

	@Autowired
	private StringRedisTemplate redisTemplete;

	@Autowired
	private JdbcTemplate jdbcTemplete;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Jdbc Templet");
		
		ValueOperations<String, String> operations = redisTemplete.opsForValue();

		operations.set("foo", "bar");
		System.out.println(operations.get("foo"));
	}

}
