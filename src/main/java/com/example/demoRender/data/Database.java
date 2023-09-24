package com.example.demoRender.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demoRender.repo.ProductRepository;
import com.example.demoRender.model.*;

@Configuration
public class Database {
	private static final Logger logger=LoggerFactory.getLogger(Database.class);
	
	@Bean
	CommandLineRunner initDatabase(ProductRepository productRepo) {
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
			 Product p1=new Product("Macbook 12",1500,2400,"");
			 Product p2=new Product("iphone 11",2000,2000,"");
			// System.out.println("insert data "+productRepo.save(p1));
			// System.out.println("insert data "+productRepo.save(p2));
			logger.info("insert data "+productRepo.save(p1));
			logger.info("insert data "+productRepo.save(p2));
			 
			}
		};
	}
}
