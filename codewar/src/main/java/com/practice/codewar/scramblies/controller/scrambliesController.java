package com.practice.codewar.scramblies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.codewar.scramblies.service.scrambliesService;

@RestController
@RequestMapping("/scramblies")
public class scrambliesController {

	@Autowired
	scrambliesService scrambliesService;
	
	@GetMapping("/{str1}/{str2}")
	public boolean scramble(@PathVariable String str1, @PathVariable String str2) {
		return scrambliesService.scramble(str1, str2);
	}
}
