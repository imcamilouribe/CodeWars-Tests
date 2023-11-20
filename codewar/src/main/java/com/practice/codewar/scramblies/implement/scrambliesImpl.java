package com.practice.codewar.scramblies.implement;

import org.springframework.stereotype.Service;

import com.practice.codewar.scramblies.service.scrambliesService;

@Service
public class scrambliesImpl implements scrambliesService{

	@Override
	public boolean scramble(String str1, String str2) {

        int[] letterCounts = new int[26]; // Assuming only lowercase letters

        for (char letter : str1.toCharArray()) {
            letterCounts[letter - 'a']++;
        }

        for (char letter : str2.toCharArray()) {
            letterCounts[letter - 'a']--;
            if (letterCounts[letter - 'a'] < 0) {
                return false; // More occurrences of a letter in str2 than in str1
            }
        }

        return true;
	}

}
