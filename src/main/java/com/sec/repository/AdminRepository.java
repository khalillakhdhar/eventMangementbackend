package com.sec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
Optional<Admin> findByEmailAndPassword(String email,String password);

}
