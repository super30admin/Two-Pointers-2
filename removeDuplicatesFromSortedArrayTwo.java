class Solution {
    public int removeDuplicates(int[] nums) {
        // T.C : O(n)
        // S.C : O(1)
        // Executed
        if(nums == null || nums.length == 0) return 0;
        
        int j = 1;
        int count = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            }
            else {
                count = 1;
            }
            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}