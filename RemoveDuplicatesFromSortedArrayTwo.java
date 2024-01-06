public class RemoveDuplicatesFromSortedArrayTwo {
    // TC: O(N) where N is length of nums
    // SC: O(1)
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
