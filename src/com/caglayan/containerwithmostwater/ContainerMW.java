package com.caglayan.containerwithmostwater;

public class ContainerMW {
	public int maxArea(int[] height) {
		int tmp = 0;
		int j = height.length - 1;

		for (int i = 0; i < j;) {
			tmp = Math.max(tmp, (j - i) * Math.min(height[i], height[j]));
			if (height[i] < height[j])
				i++;
			else
				j--;
		}
		return tmp;
	}
}