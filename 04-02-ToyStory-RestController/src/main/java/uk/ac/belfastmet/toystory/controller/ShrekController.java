package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shrekmovie")
public class ShrekController {

	@GetMapping("/")
	public String home() {
		return "Characters in the movie Shrek";
	}
	
	@GetMapping("/shrek")
	public String shrek() {
		return "Shrek was played Mike Myers";
		
	}
	
	@GetMapping("/donkey")
	public String donkey() {
		return "Donkey was played Eddie Murphy";
		
	}
	@GetMapping("/fiona")
	public String fiona() {
		return "Fiona was played Cameron Diaz";
		
}
}