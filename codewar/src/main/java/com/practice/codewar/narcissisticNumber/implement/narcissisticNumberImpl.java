package com.practice.codewar.narcissisticNumber.implement;

import org.springframework.stereotype.Service;

import com.practice.codewar.narcissisticNumber.service.narcissisticNumberService;

@Service
public class narcissisticNumberImpl implements narcissisticNumberService{

	@Override
	public boolean isNarcissistic(int number) {
		
		int digits = Integer.toString(number).length();
		int sum = 0;
		
		for(int i = 0; i < digits; i++) {
			
			char baseString = Integer.toString(number).charAt(i);
			int base = Character.getNumericValue(baseString);  
			sum += Math.pow(base, digits);
			
		}
		
		return number == sum? true : false;
	}

}
