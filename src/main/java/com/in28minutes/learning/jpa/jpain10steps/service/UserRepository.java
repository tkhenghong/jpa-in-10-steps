package com.in28minutes.learning.jpa.jpain10steps.service;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


// This thing is Spring Data JPA concept
public interface UserRepository extends JpaRepository<User, Long> {
}
