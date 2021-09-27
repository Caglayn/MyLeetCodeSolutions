package com.caglayan.integertoroman;

public class IntegerToRoman {
	public String intToRoman(int num) {
		String[][] roman = { { "", "M", "MM", "MMM", "", "", "", "", "", "" },
				{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
				{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" } };

		int tmp = 0;
		int j = 1000;
		String romanStr = "";

		for (int i = 0; i < roman.length; i++) {
			tmp = num / j;
			
			if (tmp == 0) {
				j /= 10;
				continue;
			}
				
			romanStr += roman[i][tmp];
			num -= (tmp * j);
			j /= 10;
		}

		return romanStr;
	}
}
