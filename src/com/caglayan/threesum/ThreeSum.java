package com.caglayan.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		Set<List<Integer>> resultSet = new HashSet<List<Integer>>();
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3 = 0;

		if (nums.length < 3) {
			return new ArrayList<List<Integer>>();
		} else {
			Arrays.sort(nums);
			
			for (int i = 0; i < nums.length; i++) {
				tmp1 = nums[i];
				
				if(i+1 == nums.length)
					break;
				
				for (int j = i+1; j < nums.length; j++) {
					tmp2 = nums[j];
					tmp3 = Arrays.binarySearch(nums, j+1, nums.length, (0-tmp2-tmp1));
					
					if(tmp3>0) {
						List<Integer> tmpList = new ArrayList<Integer>();
						tmpList.add(tmp1);
						tmpList.add(tmp2);
						tmpList.add(nums[tmp3]);
						resultSet.add(tmpList);
					}
				}
			}
		}
		
		List<List<Integer>> resultList = new ArrayList<List<Integer>>(resultSet);
		
		return resultList;
	}

}