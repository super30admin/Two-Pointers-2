// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution1 {
    public int removeDuplicates(int[] nums) {
        return helper(nums, 2);
    }

    private int helper(int[] nums, int k) {
        int n = nums.length;
        if( n == 1 ) {
            return 1;
        }
        int slow = 1;
        int fast = 1;
        int count = 1;
        while( fast < n ) {
            if( nums[fast] == nums[fast-1] ) {
                count++;
            } else {
                count = 1;
            }
            if( count <= k ) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}