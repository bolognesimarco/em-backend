package com.bolo.emmanagement.component11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Component1ServiceImpl implements Component1Service {
	
	@Autowired
	private Component1Repo repo;

	@Override
	public Component1 getById(Long id) throws Exception {
		Component1Entity e = repo.findById(id).orElseThrow(() -> new Exception("Component1 not found"));
		Component1 c = new Component1();
		c.setId(e.getId());
		c.setName(e.getName());
		
		return c;
	}

}
