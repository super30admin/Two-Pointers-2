
// Time Complexity : O(n) where n is the length of the input array
// Space Complexity :   O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We use two pointers, i and j, to traverse the array. 
// The pointer i keeps track of the position of the last unique element,
//  while j iterates through the array.
// If the current element at j is not equal to the last two unique elements, 
// we increment i and update the value at i to the current element at j.
// This way, we ensure that each unique element appears at most twice in the array. 
// Finally, we return i + 1 as the new length of the modified array.
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 1;

        for (int j = 2; j < nums.length; j++) {

            if (nums[j] != nums[i] || nums[j] != nums[i - 1]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}