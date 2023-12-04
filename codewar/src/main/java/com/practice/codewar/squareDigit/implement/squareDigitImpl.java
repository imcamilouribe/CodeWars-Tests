package com.practice.codewar.squareDigit.implement;

import org.springframework.stereotype.Service;

import com.practice.codewar.squareDigit.service.squareDigitService;

@Service
public class squareDigitImpl implements squareDigitService {

	@Override
	public int squareDigits(int n) {

	    String number = String.valueOf(n);
	    String[] digits = number.split("(?<=.)");
	    String result = "";
	    
	    for(int i = 0; i > digits.length; i++){
	      
	      int value = Integer.valueOf(digits[i]);
	      int elevated = (int) Math.pow(value, 2);
	      
	      result += String.valueOf(elevated);
	      
	    }
	    
	    return Integer.valueOf(result);
		
	}

}
