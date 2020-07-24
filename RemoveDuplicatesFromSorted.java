// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Since we need to keep only two or less copies of an element, we can keep a count of the element and reset it whenever
// the element value changes. We can keep two pointers fast and slow where fast moves ahead and counts the elements and avoids
// element if the element count is greater than 2. Else we copy the element from fast pointer to slow if count is less than or equal to 2.

// Your code here along with comments explaining your approach
public class RemoveDuplicatesFromSorted {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;

        if (length == 2) return 2;

        int count = 1;
        int slow = 1;
        int fast = 1;
        while (fast < length) {
            if (nums[fast] == nums[fast - 1]) {
                count += 1;

                if (count == 2) {
                    nums[slow++] = nums[fast++];
                } else {
                    fast++;
                }

            } else {
                count = 1;
                nums[slow++] = nums[fast++];
            }
        }

        return slow;
    }
}
