package com.in28minutes.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	//versioning using uri
	@GetMapping("/v1/person")
	public PersonV1 GetFirstVersionOfPerson() {
		return new PersonV1("Bob Cherlye");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 GetSecondVersionOfPerson() {
		return new PersonV2(new Name("Bob", "Charley"));
	}
	
	//versioning using query param
	//Only param with version=1 will hit this method
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 GetFirstVersionOfPersonReqParam() {
		return new PersonV1("Bob Cherlye");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 GetSecondVersionOfPersonReqParam() {
		return new PersonV2(new Name("Bob", "Charley"));
	}
	
	//versioning using header
	@GetMapping(path = "/person", headers = "X-API-VERSION=1")
	public PersonV1 GetFirstVersionOfPersonReqHeader() {
		return new PersonV1("Bob Cherlye");
	}
	
	
	@GetMapping(path = "/person", headers = "X-API-VERSION=2")
	public PersonV2 GetSecondVersionOfPersonReqHeader() {
		return new PersonV2(new Name("Bob", "Charley"));
	}
	
	//Media type versioning
	@GetMapping(path = "/person", produces = "application/vnd.company.app-v1+json")
	public PersonV1 GetFirstVersionOfPersonAcceptHeader() {
		return new PersonV1("Bob Cherlye");
	}
	
	@GetMapping(path = "/person", produces = "application/vnd.company.app-v2+json")
	public PersonV2 GetSecondVersionOfPersonAcceptHeader() {
		return new PersonV2(new Name("Bob", "Charley"));
	}
}
