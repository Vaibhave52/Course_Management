package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.RecordedVideo;

@Repository
public interface RecordedVideoRepository extends JpaRepository<RecordedVideo, Long> {

}
