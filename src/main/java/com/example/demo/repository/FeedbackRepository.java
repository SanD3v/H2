package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FeedBack;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedBack, Integer> {
	// FeedBack findFeedBackByName(String customerName);

}
