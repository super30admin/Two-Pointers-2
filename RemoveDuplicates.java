// O(n) time, O(1) sapce
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            }
            else {
                count = 1; // reset count since not same
            }

            if (count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}