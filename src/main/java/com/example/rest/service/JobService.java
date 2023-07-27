package com.example.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.mapper.JobMapper;
import com.example.rest.vo.Job;

@Service
public class JobService {
	
	@Autowired
	private JobMapper jobMapper;
	
	public List<Job> getAllJobs() {
		return jobMapper.getJobs();
	}

	public void insertNewJob(Job job) {
		jobMapper.insertJob(job);
	}

	public Job getJob(String jobId) {
		return jobMapper.getJobById(jobId);
	}
}
