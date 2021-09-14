package com.davidferreira.workshopmongo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.davidferreira.workshopmongo.domain.User;
import com.davidferreira.workshopmongo.resources.UserResource;

@Service
public class UserService {

	// Quando se declara uma var usando o @Autowired o próprio Spring procura o tipo do objeto e instancia o mesmo automaticamente.
	@Autowired private UserResource repo;
	
	public List<User> findAll() {
		return (List<User>) repo.findAll();		
	}
}
