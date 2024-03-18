// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Using two pointer approach and keeping k duplicates using the given array, no extra DS used

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int slow = 0;
        int count = 0;
        for(int i= 0; i< n; i++){
            if(i == 0 || nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <=2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}