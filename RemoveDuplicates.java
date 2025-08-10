/*
Time Complexity: O(n), where n is the length of the array.
Space Complexity: O(1), since modifications are done in-place without extra space.
Did this code successfully run on Leetcode: Yes

Explanation:
This algorithm allows each element to appear at most twice in the sorted array.
- Use two pointers: 'slow' tracks the position to insert the next allowed element,
  'fast' scans through the array.
- For each nums[fast], check if it is different from the element nums[slow - k],
  where k = 2 means we allow at most two duplicates.
- If different, copy nums[fast] to nums[slow] and increment slow.
- Continue until fast reaches the end.
- Return 'slow' as the new length of the modified array.
*/

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 2;  // maximum allowed duplicates
        if (nums.length <= k) {
            return nums.length;  // no need to process if length <= 2
        }

        int slow = k;
        int fast = k;

        while (fast < nums.length) {
            if (nums[slow - k] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }

    // Example usage
    public static void main(String[] args) {
        RemoveDuplicates sol = new RemoveDuplicates();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLength = sol.removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}