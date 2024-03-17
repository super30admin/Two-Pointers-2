// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english:

// This code removes duplicates from an array, allowing at most two occurrences of each element.

// It counts occurrences of each element, retaining them if they occur less than or equal to twice.

// The resulting array without duplicates is returned, and its length is determined.

public class Solution {
    public int RemoveDuplicates(int[] nums) {
        if(nums == null || nums.Length ==0) return 0;
        int n = nums.Length;
        int slow =0;
        int count =0;

        for(int i=0; i<n ; i++)
        {
            if(i == 0 || nums[i] == nums[i-1])
            {
                count++;
            }
            else
            {
                count =1;
            }
            if(count <=2)
            {
                nums[slow] = nums[i]; //O(1)
                slow++;
            }
        }
        return slow;

    }
}