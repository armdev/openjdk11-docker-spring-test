package io.project.app.jdkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdkdemoApplication {

    // ab -n 100000 -c 1000 http://localhost:9595/api/v2/data
	public static void main(String[] args) {
		SpringApplication.run(JdkdemoApplication.class, args);
	}

}

