// REMOVE DUPLICATES FROM SORTED ARRAY II

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Use two pointers - slow and fast. Slow pointer is used to limit the maxcount of an element to 2 and fast pointer is used to iterate/get to the next element to be included in the resultant array. Once found, the element should be overwritten in the 'slow' position

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        int slow = 1;
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                count++;
            else
                count = 1;
            if(count <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
