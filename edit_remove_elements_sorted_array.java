//Time Complexity : O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int fast = 1;
        int count=1;
        while(fast < nums.length) {
            if(nums[fast] == nums[fast-1]) {
                count++;
            } else {
                count=1;
            }
            if(count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
