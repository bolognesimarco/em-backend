package com.bolo.emmanagement.component11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Component1Resource {
	
	@Autowired
	private Component1Service serv;
	
	@GetMapping("/component1s/{id}")
	public Component1 getById(@PathVariable Long id) throws Exception {
		return serv.getById(id);
	}
}
