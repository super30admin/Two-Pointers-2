
public class Remove_Duplicates_from_sorted_array_II {
	//Approach:1. Here am using 2 pointers one for overwriting the old array and the other for iterating the old array.
	//2. So iterate the old array and compare with the other pointer's element which is twice before this pointer, if its greater i will include the element or i will discard it.
	public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<2 || nums[i] > nums[j-2])
                nums[j++] = nums[i];
        }
        return j;
    }
}
//Time Complexity : O( n) 
	//Space Complexity : O(1) 
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this :