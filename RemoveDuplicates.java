
public class Solution {

    // LeetCode Problem #80
    // Time Complexity - O(n)
    // Space Complexity - O(1)

   public static int removeDuplicates(int [] nums) {
        int slow = 2;
        int fast = 2;

        for (fast = 2; fast < nums.length; fast++) {
            if(nums[fast] > nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3,3};

        System.out.println(removeDuplicates(nums));
    }

}