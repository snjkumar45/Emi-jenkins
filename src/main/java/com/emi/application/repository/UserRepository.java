package com.emi.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emi.application.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
