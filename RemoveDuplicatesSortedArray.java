// Time Complexity : O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * 1. Mantain 2 pointers. one pointer to read an array and other to count each element up to 2 count.
 * 2. if previous and current element is same increment count otherwise make it 1.
 * 3. if count is 1 or 2 copy element to current pointer.
 */

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums.length<=1) return nums.length;
		int curp=1;
		int count =1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				count++;
			}else {
				count=1;
			}

			if(count<=2) {
				nums[curp]=nums[i];
				curp++;
			}
			
		}
		return curp;
	}
	public static void main(String[] args) {
		int[] nums= new int[] {0,0,1,1,1,1,2,3,3};
		System.out.println(new RemoveDuplicatesSortedArray().removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
}
