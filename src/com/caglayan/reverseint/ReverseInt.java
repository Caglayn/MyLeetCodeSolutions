package com.caglayan.reverseint;

public class ReverseInt {
	public int reverse(int x) {
		long reverseInt = 0;
		int tempInt = 0;

		if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE || x == 0) {
			return 0;
		} else {
			for (; x != 0;) {
				tempInt = x % 10;
				x = x - tempInt;
				x /= 10;
				reverseInt *= 10;
				reverseInt += tempInt;
			}
		}

		if (reverseInt < Integer.MIN_VALUE || reverseInt > Integer.MAX_VALUE) {
			return 0;
		} else {
			return (int)reverseInt;
		}
	}
}
