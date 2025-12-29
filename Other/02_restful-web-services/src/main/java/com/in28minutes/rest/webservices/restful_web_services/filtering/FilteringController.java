package com.in28minutes.rest.webservices.restful_web_services.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean Filtering() {
		return new SomeBean("Value1", "value2", "value3");
	}
}
