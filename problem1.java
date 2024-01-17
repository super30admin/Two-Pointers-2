// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// iterates through the array and checks if the difference between the element at index i + 2 and the element at index i is zero.
// If so swap elements to eliminate the duplicate
public class problem1 {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i + 2] - nums[i]) == 0) {
                int temp = nums[i + 2];
                nums[i + 2] = nums[i + 1];
                nums[i + 1] = temp;
                count--;
            }
        }
        return count;
    }
}
