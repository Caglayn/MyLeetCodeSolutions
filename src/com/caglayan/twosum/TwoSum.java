package com.caglayan.twosum;

import java.util.HashMap;

public class TwoSum {
	
	 public int[] twoSum(int[] nums, int target) {
	        
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 int[] result = {0,0};
		 
		 for(int i=0;i<nums.length;i++) {
			 if (map.containsKey(target-nums[i])) {
				 result[1]=i;
				 result[0]=map.get(target-nums[i]);
				 break;
			 }
			 else {
				 map.put(nums[i], i);
			 }
		 }
		 
		 
		 return result;
	    }
	

}
