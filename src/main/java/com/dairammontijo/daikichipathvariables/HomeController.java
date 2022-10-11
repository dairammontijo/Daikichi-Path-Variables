package com.dairammontijo.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikachi")
public class HomeController {

	@RequestMapping("")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/travel/{city}") 
	public String travel(@PathVariable String city) {
		return "Congratulations! You will soon travel to " + city;
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable int number) {
			if(number % 2 == 0) {
				return "You will take a grand journey in the near future, but be weary of tempting offers";
			}
			else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with your family.";
			}
	}
}
