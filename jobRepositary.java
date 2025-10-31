package com.ibm.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.jobtracker.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
