package com.spring.guru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Printable;

@SpringBootApplication
public class GuruApplication {
	public static void main(String[] args) {
		SpringApplication.run(GuruApplication.class, args);
	}
}
