package com.caglayan.romantoint;

import java.util.HashMap;

public class RomanToInt {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int result = 0;

		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		
		for(int i = 0; i<s.length();) {

			if(i+1<s.length()) {
				if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
					result+=map.get(s.charAt(i));
					i++;
				}
				else {
					result+=map.get(s.charAt(i+1)) - map.get(s.charAt(i));
					i+=2;
				}
			}
			else {
				result+=map.get(s.charAt(i));
				i++;
			}
			
		}
		
		return result;
	}
}
