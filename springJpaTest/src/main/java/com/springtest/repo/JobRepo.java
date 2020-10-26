package com.springtest.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.beans.Job;

public interface JobRepo extends JpaRepository<Job, Long> {
	List<Job> findByEndDateBetween(Date startDate , Date endDate);
	List<Job> findByEndDate(Date endDate);
}
