/**
 * Time complexity is O(n)
 * space complexity is O(1)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2) {
            return n;
        }
        
        int slow = 2;
        
        for(int fast = 2; fast < n; fast++) {
            if(nums[slow -2] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}