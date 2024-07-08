package com.emi.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emi.application.dto.UserRequest;
import com.emi.application.entity.User;
import com.emi.application.service.UserService;

@RestController
@RequestMapping("/emi/user")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/test")
	public String testApplication() {
		return "Welcome";
	}
	@GetMapping("/get/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Long userId) {
		User user = userService.getUser(userId);
		if(user==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);
	}
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody UserRequest userRequest) {
		User saveUser = userService.saveUser(userRequest);
		return saveUser;
	}
}
