# Time complexity:O(m+n)
# Space complexity: 0(1)
# Did code run successfully on leetcode: yes
# Any problem you faced: No


class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 2;
        int fast = 2;

        for(fast = 2; fast<=nums.length - 1; fast++){
            if(nums[fast] > nums[slow - 2]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
