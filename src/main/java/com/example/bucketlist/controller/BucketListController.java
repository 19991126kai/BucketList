package com.example.bucketlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BucketListController {

	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
}
