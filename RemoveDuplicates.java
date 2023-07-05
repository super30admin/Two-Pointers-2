class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2, index = 0;
        if (nums.length == 1) {
            return k = 1;
        }
        for (int i = 0; nums.length - 3 >= i; i++) {
            if (!(nums[i] == nums[i + 2])) {
                nums[index] = nums[i];
                index++;
                k++;
            }
        }
        nums[index] = nums[(nums.length - 2)];
        nums[index + 1] = nums[(nums.length - 1)];
        return k;
    }
}