package com.caglayan.lengthoflongestsubstring;

import java.util.HashMap;

/**
 * 
 * Input: s = "pwwkew" Output: 3
 *
 **/

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0, point = 0;

		if (s.length() == 0) {
			return 0;
		}

		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), i);

			} else {
				point = map.get(s.charAt(i));
				
				if (max < map.size()) {
					max = map.size();
				}
				
				map.clear();
				
				for(int j=point;j<=i;j++) {
					map.put(s.charAt(j), j);
				}
				

			}
		}
		
		if (max < map.size()) {
			max = map.size();
		}

		return max;
	}
}
