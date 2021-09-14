package com.davidferreira.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.davidferreira.workshopmongo.Services.UserService;
import com.davidferreira.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
}
