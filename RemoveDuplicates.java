//Time Complexity: O(n)
//Space Complexity: O1)
// Did this code successfully run on Leetcode : Yes

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        //null case
        if(nums.length < 3) {
            return nums.length;
        }
        int count = 1;
        int k = 2;
        int slow = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            }
            else
                count = 1;
            if(count <= k) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
