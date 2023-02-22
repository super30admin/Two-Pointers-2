// TC: O(n)
// SC: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int k = 2;
        int i, j, count;
        count = 1;
        i = 1;
        j = 1;
        while(i < nums.length) {
            if(nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= k) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}