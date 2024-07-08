package com.emi.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emi.application.dto.UserRequest;
import com.emi.application.entity.User;
import com.emi.application.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public User saveUser(UserRequest userRequest) {
		User user = new User();
		user.setAge(userRequest.getAge());
		user.setLoanType(userRequest.getLoanType());
		user.setMobile(Long.valueOf(userRequest.getMobile()));
		user.setAge(userRequest.getAge());
		user.setName(userRequest.getName());
		user.setRemainingMonth(userRequest.getRemainingMonth());
		user.setTenure(userRequest.getTenure());
		User save = userRepo.save(user);
		return save;

	}

	public User getUser(Long userId) {
		Optional<User> byId = userRepo.findById(userId);
		
		return byId.orElse(null);
	}
}
