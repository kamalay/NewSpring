package com.restful.objects;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	public String getAllTopics() {
		
		return "All topics";
		
	}

}
