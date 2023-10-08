package com.transporte.project.transproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transporte.project.transproject.control.User;


// repsitory é camada que faz contato com as enidades, a intarface delas
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
