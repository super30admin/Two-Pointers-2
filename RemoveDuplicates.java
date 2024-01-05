/*
* Approach:
*  1. Generic algorithm to handle for K duplicates:
        maintain two pointers,
            one which assigns the correct element inplace.
            one which traverses the entire array.
* 
*  2. Maintain count of element which is being tracked, 
        check with allowed K everytime.
    
    If count is within limit,
         move the start pointer and override the element inplace.  
* 
*  3. If new element appears, update the count to 1,
        which will automatically override the element inplace of start.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 2, start = 0, count = 1;

        for (int index = 1; index < nums.length; index++) {
            if (nums[index] == nums[index - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= k) {
                start++;
                nums[start] = nums[index];
            }
        }

        return start + 1;
    }
}
