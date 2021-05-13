package TwoPointers2;

/*S30 Big N Problem #39 {Medium} - 
You are given a sorted array nums, you have to remove the duplicates without using extra space such that no duplicates appeared more than twice and 
then at last you need to return the length of the updated array and we are making changes in the same array. do this in o(1) extra space .
Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well

Example 1:
Given nums = [1,1,,1,1,1,1,1,1,,2,2,2,2,2,2,2,3,4],
Your function should return length = 6, with the first five elements of nums being 1, 1, 2, 2 ,3 and 4 respectively.
It doesn't matter what you leave beyond the returned length.
Source Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
    -------------------------------------------------------------------------------------------------------
    Time complexity : o(n) 
    space complexity: o(1) 
    Did this code run successfully in leet code : yes
    problems faces : no
    */

public class RemoveDuplicatesSortedArray {
    
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int count=1; int j=1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
            {
                count++;
            } else 
            {
                count = 1;
            }
            if(count <=2 )
            {
                nums[j] = nums[i];
                j++;
            }
        }
            
        
        return j;
    }

}
