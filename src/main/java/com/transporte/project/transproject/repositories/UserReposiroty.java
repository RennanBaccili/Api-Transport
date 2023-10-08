package com.transporte.project.transproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.project.transproject.control.User;

public interface UserReposiroty extends JpaRepository<User, Long>{

}
