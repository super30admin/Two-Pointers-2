class Solution {
    public int removeDuplicates(int[] nums) {
        // 0,0,1,1,1,1,2,3,3
        // 0,0,1,1,2,3,3,3,3
        
        int n = nums.length;
        if (nums == null || n == 0) {
            return 0;
        }

        int j = 1;
        int i = 1;
        int count = 1;

        while (i < n) {
            
            if (nums[i] == nums[i - 1]) {
                ++count;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }

        
            ++i;
        }

        return j;


    }
}