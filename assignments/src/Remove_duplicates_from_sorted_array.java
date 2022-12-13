public class Remove_duplicates_from_sorted_array {

    // Time: O(n), Space: O(1)
    public int removeDuplicates(int[] nums) {

        int j = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            // overwrite element at j to i
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}