package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {

}
