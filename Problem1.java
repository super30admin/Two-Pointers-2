// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;
public class Problem1 {

    public static int removeDuplicates(int[] nums) {
        // Set current and start pointer to 1
        int curr = 1, start = 1;
        // Initialize flag to true
        boolean flag = true;
        while (curr < nums.length) {
            // If element at current index is equal to previous element
            if (nums[curr] == nums[curr-1]) {
                // If flag is true, set value at start index to value at current index and increment start pointer by 1
                // Set flag to false
                if (flag) {
                    nums[start++] = nums[curr];
                    flag = false;   
                }  
            } else { // If element at current index is not equal to previous element
                // Set value at start index to value at current index and increment start pointer by 1
                // Set flag to true
                nums[start++] = nums[curr];
                flag = true;  
            }
            // Increment current pointer by 1
            curr++;
        }
        // return start index as it is the final size because start index has incremented by 1 after inserting the last element
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] ans = Arrays.copyOfRange(nums, 0, removeDuplicates(nums));
        System.out.println(Arrays.toString(ans));
    }
    
}