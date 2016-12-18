package com.skhu.Ian.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skhu.Ian.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	public List<User> findAll();
}
