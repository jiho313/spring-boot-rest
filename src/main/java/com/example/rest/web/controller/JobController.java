package com.example.rest.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.service.JobService;
import com.example.rest.vo.Job;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class JobController {

	@Autowired
	private JobService jobService;
	
	@GetMapping("/jobs")
	public List<Job> getAlljobs() {
		List<Job> jobs = jobService.getAllJobs();
		return jobs;
	}
	
	@GetMapping("/jobs/{jobId}")
	public Job getJob(@PathVariable("jobId") String jobId) {
		log.info("jobId -> {}", jobId);
		Job job = jobService.getJob(jobId);
		return job;
	}
	
	@PostMapping("/jobs")
	public Job createJob(@RequestBody Job job) {
		log.info("요청데이터 -> {}", job);
		jobService.insertNewJob(job);
		return job;
	}
	
	
}
