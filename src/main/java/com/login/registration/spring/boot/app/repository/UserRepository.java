package com.login.registration.spring.boot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.registration.spring.boot.app.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
