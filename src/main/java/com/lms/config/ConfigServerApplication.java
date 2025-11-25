package com.lms.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * LMS Config Server application.
 * This class enables the Config Server functionality.
 */
@SpringBootApplication
@EnableConfigServer // આ એનોટેશન કોન્ફિગ સર્વરને સક્ષમ કરે છે
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}