package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

//	Optional<Staff> findByEmailAndPassword(String email, String password);
}
