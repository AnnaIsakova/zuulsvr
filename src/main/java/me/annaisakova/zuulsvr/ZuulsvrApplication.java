package me.annaisakova.zuulsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulsvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulsvrApplication.class, args);
	}

}
