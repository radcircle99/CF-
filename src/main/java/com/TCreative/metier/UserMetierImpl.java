package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TCreative.dao.UserRepository;
import com.TCreative.entities.User;

@Service
public class UserMetierImpl implements UserMetier {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(int idUser) {
		// TODO Auto-generated method stub
		userRepository.deleteById(idUser);
	}

	@Override
	public User updateUser(User newUser, int idUser) {
		// TODO Auto-generated method stub
		return userRepository.findById(idUser).map(u -> {
			if (newUser.getLogin() != null)
				u.setLogin(newUser.getLogin());
			if (newUser.getPassword() != null)
				u.setPassword(newUser.getPassword());
			if (newUser.getDroit() != 0)
				u.setDroit(newUser.getDroit());
			return userRepository.save(u);
		}).orElseGet(() -> {
			newUser.setIdUser(idUser);
			return userRepository.save(newUser);
		});
	}

	@Override
	@Transactional
	public boolean coonectUser(String login, String password) {
		// TODO Auto-generated method stub
		for (User u : userRepository.findAll()) {
			if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
				// System.out.println("Succes!");
				return true;
			}
		}
		// System.out.println("Fail");
		return false;
	}

	@Override
	public Optional<User> findUser(int idUser) {
		// TODO Auto-generated method stub
		return userRepository.findById(idUser);
	}

}
