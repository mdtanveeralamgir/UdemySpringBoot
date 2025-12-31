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
	public List<Object> FilteringList() {
		SomeBean bean1 = new SomeBean("Value1", "value2", "value3");
		SomeBean bean2 = new SomeBean("Value1", "value2", "value3");
		Map<String, String> map1 = new HashMap<>();
		map1.put("value1", bean1.getField3());

		Map<String, String> map2 = new HashMap<>();
		map2.put("value3", bean2.getField3());
		List<Object> result = Arrays.asList(map1, map2);

		return result;
	}
}
