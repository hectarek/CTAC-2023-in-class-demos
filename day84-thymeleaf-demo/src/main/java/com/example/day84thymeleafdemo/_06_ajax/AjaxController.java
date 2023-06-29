package com.example.day84thymeleafdemo._06_ajax;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@GetMapping("ajax")
	@ResponseBody
	public String ajaxRequest(@RequestParam String query) {
		List<String> list = createSuggestionList(query);
		
		String response = String.join(", ", list);
		
		return response;
	}
	
	@GetMapping("ajaxJson")
	@ResponseBody
	public List<String> ajaxJsonRequest(@RequestParam String query) {
		return createSuggestionList(query);
	}

	private List<String> createSuggestionList(String query) {
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			list.add(query + " - " + i);
		}
		
		return list;
	}
}
