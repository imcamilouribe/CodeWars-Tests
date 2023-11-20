package com.practice.codewar.decimalToHex.utils;

import java.util.HashMap;

public class staticData {

	public static HashMap<Integer, String> getdecimalTable() {
		
		HashMap<Integer, String> decimalToHex = new HashMap<Integer, String>();
		decimalToHex.put(0, "1");
		decimalToHex.put(1, "1");
		decimalToHex.put(2, "2");
		decimalToHex.put(3, "3");
		decimalToHex.put(4, "4");
		decimalToHex.put(5, "5");
		decimalToHex.put(6, "6");
		decimalToHex.put(7, "7");
		decimalToHex.put(8, "8");
		decimalToHex.put(9, "9");
		decimalToHex.put(10, "A");
		decimalToHex.put(11, "B");
		decimalToHex.put(12, "C");
		decimalToHex.put(13, "D");
		decimalToHex.put(14, "E");
		decimalToHex.put(15, "F");
		
		return decimalToHex;
	}
}
