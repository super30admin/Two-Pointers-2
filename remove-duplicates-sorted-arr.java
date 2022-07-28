// TC: O(n)
// SC: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        
        int j=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != nums[j]) {
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}
