class Solution {
    public int removeDuplicates(int[] nums) {

        int p0 = 0;
        int p1 = 1;

        for (int i=0; i<nums.length; i++) {
            if (nums[p0] == nums[p1]) {
                if (nums[p1 + 1] == nums[p0]) {
                    p0++;
                }
            }
        }
        return p0;

    }
}