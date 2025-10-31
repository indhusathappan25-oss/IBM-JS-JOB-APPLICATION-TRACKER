package com.ibm.jobtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ibm.jobtracker.model.Job;
import com.ibm.jobtracker.repository.JobRepository;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*")
public class JobController {

    @Autowired
    private JobRepository repo;

    @GetMapping
    public List<Job> getAllJobs() {
        return repo.findAll();
    }

    @PostMapping
    public Job addJob(@RequestBody Job job) {
        return repo.save(job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
