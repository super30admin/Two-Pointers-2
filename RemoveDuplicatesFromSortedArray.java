
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int index = 2;
        for(int i=2; i<nums.length; i++){
            if(nums[i]!=nums[i-2])
                nums[index++] = nums[i];
        }
        return index;
    }
}
