package com.caglayan.twosum;


public class TwoSumTest {

	public static void main(String[] args) {
		int[] testArray = {3,5,8,15,48,26,47,23,35,22,24,88,75,56};
		int target = 90;
		TwoSum test = new TwoSum();
		int[] result = test.twoSum(testArray, target);
		
		System.out.println("["+result[0]+","+result[1]+"]");

	}

}
