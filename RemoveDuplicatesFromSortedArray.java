// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        // 2 pointers
        int slow = 0;
        int count = 1;

        for(int i = 1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]){
                count++;
            }
            else {
                count = 1;
            }
            if(count <= 2) {
                slow++;
                nums[slow] = nums[i];

            }
        }
        return slow + 1;
    }

}