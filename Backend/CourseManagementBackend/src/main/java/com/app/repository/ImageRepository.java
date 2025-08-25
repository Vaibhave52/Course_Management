package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
