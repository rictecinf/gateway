package br.com.poc.poc_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Arrays;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class PocGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocGatewayApplication.class, args);
	}

}


