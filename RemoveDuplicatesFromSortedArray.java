// Time complexity : O(n)
// Space complexity : O(1)
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int slow = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
    }
}
