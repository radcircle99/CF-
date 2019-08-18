package com.TCreative.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TCreative.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
