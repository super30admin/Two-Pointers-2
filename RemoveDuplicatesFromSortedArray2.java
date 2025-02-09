// Time complexity:- O(n)
// Space complexity:- O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach 
/**
 * Approach: 
 * This problem is about removing duplicates from a sorted array, while allowing each element to appear at most twice. 
 * We iterate through the array, keeping track of the current element and its frequency, and only place the element in the result if it appears no more than twice. 
 * Finally, we return the length of the modified array, which represents the number of valid elements.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
        int idx = 1;
        int currElement = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) { 
            // If the current element matches the previous one, increase the count 
            if (nums[i] == currElement) {
                count++;
                
            } else {
                // If it's a new element, reset count and update currElement
                currElement = nums[i];
                count = 1;
            }
            // If the element appears less than or equal to 2 times, place it at the idx position
            if (count <= 2) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        // Return the new length of the modified array
        return idx;
    }
}


   

     