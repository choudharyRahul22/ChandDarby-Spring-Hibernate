package com.luv2code.springdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/")
	public String getHome() {
		return "From home page";
	}
	
	@RequestMapping("/home")
	public String getHomeParam(@RequestParam("name") String name) {
		System.out.println(name);
		return "home page param : " + name;
	}
	
	@RequestMapping("/countryOptions")
	public String countryOptions() {
		System.out.println(countryOptions);
		return "see";
	}

}
