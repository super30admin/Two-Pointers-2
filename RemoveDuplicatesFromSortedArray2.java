// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
Take 2 pointers as slow and fast. As per problem, k is atmost twice. So, we initially start with slow and
fast at k index.Now, we need to check if even post k indices, fast pointer and slow before k index are still
the same.If yes, it means we are still watching duplicates post k times, so we just increment fast pointer.
If not, we came across non-duplicate value and we need to swap that value with slow pointer's value.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int slow = k , fast = k;

        while(fast < nums.length) {
            if(nums[slow - k] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}