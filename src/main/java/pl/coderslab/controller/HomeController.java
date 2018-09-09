package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/forms")
public class HomeController {

	@GetMapping
	public String getHome() {
		return "widok";
	}
}
