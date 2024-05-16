package com.hacen.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hacen.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

		User findByUsername(String username);

}
