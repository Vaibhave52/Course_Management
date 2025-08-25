package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.BatchCycle;
import com.app.entity.Premises;


@Repository
public interface PremisesRepository extends JpaRepository<Premises, Long> {

//	List<Premises> findAllById(Long premisesId);

}
