package com.practice.codewar.scramblies.implement;

import com.practice.codewar.scramblies.service.scrambliesService;

public class scrambliesImpl implements scrambliesService{

	@Override
	public boolean scramble(String str1, String str2) {
	
		boolean canScramble = true;
		 String toCompare = str1.length() > str2.length()? str2 : str1;
	    char[] letters = str1.length() > str2.length()? str1.toCharArray() : str2.toCharArray();
		  
		  for(char letter: letters){
		    if (!toCompare.contains(String.valueOf(letter))) {
		    	canScramble = false;
		    	break;
		    }
		  }
	      
			return canScramble;
	}

}
