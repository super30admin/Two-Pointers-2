// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 1, count = 1;
        //Move pointer i untill we find another element when count>2
        for (int i = 1; i < nums.length; i++) {
            //if current element is duplicate increase count
            if (nums[i] == nums[i - 1]) {        
                count++;
            } else {
                count = 1;
            }
            //Copy the element
            if (count <= 2) {
                nums[start] = nums[i];
                start++
            }
        }
        return start;
    }
}