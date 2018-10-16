package org.toughchow.hereyouare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HereyouareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HereyouareServiceApplication.class, args);
	}
}
