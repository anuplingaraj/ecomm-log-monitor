package com.ecommerce.logmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Zipkin server for distributed tracing with port 9411.
 * @EnableZipkinServer has been decapricated
 */

@SpringBootApplication
public class LogMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogMonitorApplication.class, args);
	}

}
