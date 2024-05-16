package com.hacen.users.service;

import java.util.List;

import com.hacen.users.entities.Role;
import com.hacen.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();

}
