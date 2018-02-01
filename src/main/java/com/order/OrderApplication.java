package com.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(OrderApplication.class); 
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
        logger.info("ok================");
    }

}
