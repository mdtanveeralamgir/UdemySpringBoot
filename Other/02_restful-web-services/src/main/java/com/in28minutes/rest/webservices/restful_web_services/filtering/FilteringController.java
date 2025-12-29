package com.in28minutes.rest.webservices.restful_web_services.filtering;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public Object Filtering() {
		SomeBean bean = new SomeBean("Value1", "value2", "value3");
		
		Map<String, Object> result = new HashMap<>();
		
		result.put("filed1", bean.getField1());
		result.put("filed2", bean.getField2());
		
		return result;

	}

	@GetMapping("/filtering-list")
	public List<SomeBean> FilteringList() {
		return Arrays.asList(new SomeBean("Value1", "value2", "value3"), new SomeBean("Value1", "value2", "value3"));
	}
}
