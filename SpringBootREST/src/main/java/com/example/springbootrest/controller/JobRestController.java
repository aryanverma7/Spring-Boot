package com.example.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springbootrest.model.JobPost;
import com.example.springbootrest.service.JobService;

@RestController	//Tells not to look for view files as we r returning data
//@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
	
	@Autowired
	private JobService service;

	@GetMapping("load")
	public String loadData() {
		service.load();
		return "success";
	}

	@GetMapping("jobPosts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
	}

	@GetMapping("jobPost/{postId}")
	public JobPost getJob(@PathVariable("postId") int postId){
		return service.getJob(postId);
	}

	@GetMapping("jobPosts/keyword/{keyword}")
	public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
		return service.search(keyword);
	}

	@PostMapping("jobPost")
	public JobPost addJob(@RequestBody JobPost jobPost){
		service.addJob(jobPost);
		return service.getJob(jobPost.getPostId());
	}

	@PutMapping("jobPost")
	public JobPost updateJob(@RequestBody JobPost jobPost) {
		service.updateJob(jobPost);
		return service.getJob(jobPost.getPostId());
	}

	@DeleteMapping("jobPost/{postId}")
	public String deleteJob(@PathVariable int postId)
	{
		service.deleteJob(postId);
		return "Deleted";
	}

}
