package com.example.day84thymeleafdemo._04_shareData;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllersAreSingleton {

	private int counter = 0;
	
	@GetMapping("/share_data")
	public String renderListPage(Model model) {
		int counterValue = counter;
		counterValue++;
		
		model.addAttribute("counterValue", counterValue);
		
		counter = counterValue;
		return "shareData";
	}
}
