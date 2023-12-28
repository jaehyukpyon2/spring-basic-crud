package kr.co.chunjae.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HomeController {

	@GetMapping
	public String home() {
		log.fatal("Welcome Home!");
		log.error("Welcome Home!");
		log.warn("Welcome Home!");
		log.info("Welcome Home!");
		log.debug("Welcome Home!");
		return "index";
	}
}
