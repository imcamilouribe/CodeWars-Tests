package com.practice.codewar.spinningWord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.codewar.spinningWord.service.spinWordService;

@RestController
@RequestMapping("/spin-words")
public class spinWordController {

	@Autowired
	spinWordService spinService;
	
    @GetMapping("")
    public String spinWordsEndpoint(@RequestParam String sentence) {
        return spinService.spinWords(sentence);
    }
}
