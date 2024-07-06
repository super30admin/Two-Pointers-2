//Time Complexity - O(n)
//Space Complexity - O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int count = 1;
        for(int i=1;i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count += 1;
            }
            else {
                count = 1;
            }
            if(count <= 2) {
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }
}