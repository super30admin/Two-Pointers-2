// Time Complexity : O(n) n is number of elements in array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int j = 1;
        int count = 1;
        for(int i = 1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]){
                count++;
            } else {
                count = 1;
            }
            if(count <=2 ){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}