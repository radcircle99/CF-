package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import com.TCreative.entities.User;

public interface UserMetier {

	public User saveUser(User u);

	public List<User> listUser();

	public Optional<User> findUser(int idUser);

	public void deleteUser(int idUser);

	public User updateUser(User u, int idUser);

	public boolean coonectUser(String login, String password);
}
