package cam.caglayan.myatoi;

public class MyAtoi {
	public int myAtoi(String s) {
		long result = 0;
		int sign = 1;
		char tmp;
		boolean atLeading = true;

		for (int i = 0; i < s.length(); i++) {
			tmp = s.charAt(i);
			if (atLeading && tmp == '+') {
				atLeading = false;
				continue;
			} else if (atLeading && tmp == '-') {
				sign = -1;
				atLeading = false;
				continue;
			} else if (atLeading && tmp == ' ') {
				continue;
			} else if (Character.isDigit(tmp)) {
				atLeading = false;
				result *= 10;
				result += Character.getNumericValue(tmp);
				
				if(result > Integer.MAX_VALUE)
				{
					break;
				}
				
			} else {
				break;
			}
		}

		result *= sign;

		if (result < Integer.MIN_VALUE) {
			result = Integer.MIN_VALUE;
		} else if (result > Integer.MAX_VALUE) {
			result = Integer.MAX_VALUE;
		}

		return (int) result;
	}
}
