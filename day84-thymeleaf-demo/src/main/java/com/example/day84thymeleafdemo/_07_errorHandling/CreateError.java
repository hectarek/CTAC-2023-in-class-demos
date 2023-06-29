package com.example.day84thymeleafdemo._07_errorHandling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("createError")
public class CreateError {

	@GetMapping
	public void createError() {
		throw new RuntimeException("Bu hata bizim hatamizdir");
	}
}
