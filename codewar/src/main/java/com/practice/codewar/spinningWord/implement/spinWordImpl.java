package com.practice.codewar.spinningWord.implement;

import org.springframework.stereotype.Service;

import com.practice.codewar.spinningWord.service.spinWordService;

@Service
public class spinWordImpl implements spinWordService{

	@Override
	public String spinWords(String sentence) {
	    String result = "";
	    String[] array = sentence.split(" ");
	    
	    for(String word: array){
	      if(word.length() > 4) {
	        for(int i = word.length(); i > 0; i--){
	          result += word.charAt(i-1);
	        }
	        
	        if (array.length > 1 ) result += " ";
	      }
	      else{
	         result += word;
	         if (array.length > 1 ) result += " ";
	    }
	  }
	    return result;
	}

}
