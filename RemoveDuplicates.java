public class RemoveDuplicates {
    // TC O(N)
    // SC O(1)
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 1;
        int cnt = 1;
        int i = 1;
        while (j < nums.length) {
            if (nums[j - 1] == nums[j]) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt <= 2) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
