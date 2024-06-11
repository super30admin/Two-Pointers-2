class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null && nums.length == 0) {
            return 0;
        }

        int i = 1;

        int count = 1;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] == nums[j - 1]) {
                count++;
            } else {
                count = 1;
            }

            if(count <= 2) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
