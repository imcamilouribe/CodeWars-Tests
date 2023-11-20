package com.practice.codewar.decimalToHex.implement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.codewar.decimalToHex.service.decimalToHexService;
import com.practice.codewar.decimalToHex.utils.staticData;

@Service
public class decimalToHexImpl implements decimalToHexService{

	@Override
	public String rgb(int r, int g, int b) {
		
		HashMap<Integer, String> decimalTable = staticData.getdecimalTable();
		String result = "";
		List<Integer> rgb = new ArrayList<Integer>();
		rgb.add(r);
		rgb.add(g);
		rgb.add(b);
		
		for(int letter: rgb) {
			
			BigDecimal value1 = new BigDecimal(letter).divide(new BigDecimal(16));
			int valueInt1 = value1.intValue();
			
			if (valueInt1 < 0) valueInt1 = 0;
			if (valueInt1 > 15) valueInt1 = 15;
			
			result += decimalTable.get(valueInt1);
			
			BigDecimal value2 = value1.subtract(new BigDecimal(valueInt1)).multiply(new BigDecimal(16));
			int valueInt2 = value2.intValue();
			
			if (valueInt2 < 0) valueInt2 = 0;
			if (valueInt2 > 15) valueInt2 = 15;
			
			result += decimalTable.get(valueInt2);
		}
		
		return result;
	}

}
