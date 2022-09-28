// TC : O(n)
// SC : O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
                
        int j = 0;
        
        for(int k : nums)
            if(j < 2 || nums[j-2] != k)
                nums[j++] = k;
        
        return j;
    }
}
