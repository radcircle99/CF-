package com.TCreative.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TCreative.entities.User;
import com.TCreative.metier.UserMetier;

@RestController
public class UserRestService {

	@Autowired
	private UserMetier userMetier;

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User saveUser(@RequestBody User u) {
		return userMetier.saveUser(u);
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> listUser() {
		return userMetier.listUser();
	}

	@DeleteMapping(value = "/users/{idUser}")
	public void deleteUser(@PathVariable int idUser) {
		userMetier.deleteUser(idUser);
	}

	@PutMapping(value = "/users/{idUser}")
	public User updateUser(@RequestBody User u, @PathVariable int idUser) {
		return userMetier.updateUser(u, idUser);
	}

	@PutMapping(value = "/users")
	public boolean coonectUser(@RequestParam String login, @RequestParam String password) {
		return userMetier.coonectUser(login, password);
	}

	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	public Optional<User> findUser(@PathVariable int idUser) {
		return userMetier.findUser(idUser);
	}

}
