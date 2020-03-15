package com.yobuligo.DemoKeycloak2.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreeAccessController {

	@GetMapping("freeAccess")
	public String getFreeAccess() {
		return "Free Access Webservices wurde aufgerufen";
	}

}
