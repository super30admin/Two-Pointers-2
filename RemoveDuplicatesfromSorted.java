class RemoveDuplicatesfromSorted {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
// TC:O(N) SC:O(1)
