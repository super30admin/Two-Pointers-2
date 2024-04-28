// Time Complexity : O(N), N is the length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int k = 2;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                count++;
            }else {
                count = 1;
            }
            if(count <= k) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}