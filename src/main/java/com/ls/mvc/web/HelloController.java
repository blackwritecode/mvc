package com.ls.mvc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	private Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/index")
	public String hello() {
		logger.info("访问index");
		return "index";
	}
}
