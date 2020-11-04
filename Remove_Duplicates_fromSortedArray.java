//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

class Remove_Duplicates_fromSortedArray {
	public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        int count = 1;
        int i = 1;
        int j = 1;
        while(j < nums.length)
        {
        	if(nums[j] == nums[j-1])
        		count++;
        	else
        		count = 1;

        	if(count <= 2)
            {
            	nums[i] = nums[j];
                i++;
            }
        	j++;
        	
        }
        return i;
	}
    public static void main(String[] args)
    {
    		int[] arr = {0,0,1,1,1,2,3,3};
    		Remove_Duplicates_fromSortedArray t = new Remove_Duplicates_fromSortedArray();
  
    		System.out.println(t.removeDuplicates(arr));	
    	
    }
}
