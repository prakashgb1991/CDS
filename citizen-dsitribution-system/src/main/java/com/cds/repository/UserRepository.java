package com.cds.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cds.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
    @Query("SELECT e from User e where e.salary BETWEEN 0 and 4000 ")       // using @query
    List<User> findUsers();
}