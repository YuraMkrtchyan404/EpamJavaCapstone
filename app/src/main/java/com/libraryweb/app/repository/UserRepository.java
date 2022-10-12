package com.libraryweb.app.repository;

import com.libraryweb.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository already inherits the @Repository annotation
public class UserRepository extends JpaRepository<User, Long> {

}
