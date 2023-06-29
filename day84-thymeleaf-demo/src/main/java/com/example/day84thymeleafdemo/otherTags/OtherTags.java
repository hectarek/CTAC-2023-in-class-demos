package com.example.day84thymeleafdemo.otherTags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherTags {

	@GetMapping("otherTags")
	public String renderOtherTags(Model model) {
		
		model.addAttribute("counter", 5);
		model.addAttribute("okunur", Math.random() > 0.5);
		model.addAttribute("kapali", Math.random() > 0.5);
		
		model.addAttribute("ahmetValue", "bunu ahmet ozelliginin yaninda gorecegiz");
		
		model.addAttribute("butonValue", "th:attr çok kullanılabilir");
		
		model.addAttribute("textWithHtml", "<i><b>Merhaba</b></i>");
		
		
		return "otherTags";
	}
}
