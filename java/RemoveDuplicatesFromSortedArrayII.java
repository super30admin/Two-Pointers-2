package java;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 2;

        int slow = 0, fast = 0, count = 0;

        while (fast < n) {
            if (fast != 0 && nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= k) {
                nums[slow] = nums[fast]; //As fast keeps track of next unique element
                slow++;
            }
            fast++;

        }
        return slow;
    }
}

/**
 * TC: O(N)
 * SC: O(1)
 */