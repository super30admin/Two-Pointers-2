// Time Complexity : O(n)
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args)
    {
//        int[] nums = {1,1,1,2,2,3};
        int[] nums = {0,0,1,1,1,1,2,3,3};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        if(nums.length < 3) {
            return nums.length;
        }

        int slow = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}
