// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/**
 * We are using a slow and a fast pointer in this approach. As we can have
 * at most 2 same elements, we are keeping our count to 2. When we start the
 * iteration we start with count as 0 which is reset to 1 if fast is at 0th
 * index, or we find a unique element. Otherwise, we keep increasing the count.
 * At every iteration we check if count is <=2. If it is we copy the element at
 * fast index to slow index and increase slow. At last, we return slow as it is the
 * length and 0 to slow-1 has our answer.
 */

public class Problem1 {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int cnt = 0;

        for(int i=0; i<nums.length; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                cnt = 1;
            } else {
                cnt++;
            }

            if(cnt <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}
