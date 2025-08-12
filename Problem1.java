/*Time Complexity:O(n)
Space Complexity:O(1)
Approach:Use two pointers. Traverse the sorted array and allow each number to appear at most twice. Track how many times the current number has appeared using a counter. If it's ≤2, copy it forward using a separate pointer j. This ensures in-place removal of extra duplicates.*/
class Problem1 {
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array is null or empty, return 0
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 1;// Tracks how many times the current element has appeared
        int j = 1; // Points to the position where the next valid element should go
        // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            // If current is same as previous, increment count
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {// If it's a new number, reset count to 1
                count = 1;
            }

            if (count <= 2) { // If the count is ≤ 2, we keep the number
                nums[j] = nums[i];// Place valid element at position j
                j++; // Move to next position
            }
        }
        return j;// j is the new length of the array with duplicates allowed at most twice

    }
}