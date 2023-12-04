package com.practice.codewar.squareDigit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.codewar.squareDigit.service.squareDigitService;

@RestController
@RequestMapping("square-digits")
public class squareDigitController {

	@Autowired
	squareDigitService squareService;
	
	@GetMapping()
	public int squareDigits(@RequestParam int n) {
		return squareService.squareDigits(n);
		
	}
	
}
