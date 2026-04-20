package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.entity.User;

public interface UserRepository 
          extends JpaRepository<User, Long>
{
	}