package com.practice.codewar.narcissisticNumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.codewar.narcissisticNumber.service.narcissisticNumberService;

@RestController
@RequestMapping("/narcissistic-number")
public class narcissisticNumberController {

	@Autowired
	narcissisticNumberService narcissisticService;
	
	@GetMapping("")
	public boolean isNarcissistic(@RequestParam int number) {
		return narcissisticService.isNarcissistic(number);
		
	}
}
