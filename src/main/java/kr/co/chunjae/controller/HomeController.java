package kr.co.chunjae.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j
public class HomeController {

	@GetMapping
	public String home() {
		log.info("Welcome Home!");
		return "index";
	}
}
