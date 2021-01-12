/**
Leetcode: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
Given a sorted array nums, remove the duplicates in-place such that duplicates
 appeared at most twice and return the new length.

Do not allocate extra space for another array; you must do this by modifying
the input array in-place with O(1) extra memory.

The brute force approach is to use the hashmap here and iterate over the hashmap and
and then create the new array

WE have to implement the alogorithm which will do evertything inplace i.e. 
without using extra space

Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


**/
class Solution 
{
    public int removeDuplicates(int[] nums) 
    {

    	if(nums == null || nums.length == 0)
    		return 0;

    	int count = 1;
    	int j = 1;


    	for(int i = 1; i< nums.length; i++)
    	{

    		if(nums[i] == nums[i-1])
    		{
    			count++;
    		}
    		else
    		{
    			count = 1;
    		}

    		if(count <=2)
    		{
    			nums[j] = nums[i];
    			j++;

    		}

    	}

    	return j;
        
    }
}