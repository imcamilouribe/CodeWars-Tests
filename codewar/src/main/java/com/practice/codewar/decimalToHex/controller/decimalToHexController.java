package com.practice.codewar.decimalToHex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.codewar.decimalToHex.service.decimalToHexService;

@RestController
@RequestMapping("/decimalToHex")
public class decimalToHexController {

	@Autowired
	decimalToHexService decimalService;
	
	@GetMapping("")
	public String getDecimalToHex(@RequestParam int r, @RequestParam int g, @RequestParam int b) {
		return decimalService.rgb(r, g, b);
	}
}
