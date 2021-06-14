package TwoPointers2;

/*
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