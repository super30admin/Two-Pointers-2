// Time Complexity : O(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/**
 * Removing unwated duplicates and maintaning up to 2 duplicate elements in the array. 
 * we need to maintain fast and slow pointers and slow pointer will wait at first repeated to swap with fast pointer
 */
// Your code here along with comments explaining your approach

/**
 * RemoveDuplicates
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int mainCount = 0;
        int count = 0;
        int current = nums[0];
        int fast = 0;
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[fast] == current && count < 2) {
                if (fast != slow) {
                    swap(nums, slow, fast);
                }
                slow++;
                fast++;
                count++;
                mainCount++;
            } else if (nums[fast] == current) {
                fast++;
            } else {
                current = nums[fast];
                count = 1;
                mainCount++;
                swap(nums, slow, fast);
                fast++;
                slow++;
            }

        }
        return mainCount;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}