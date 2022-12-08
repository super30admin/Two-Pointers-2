public class Leetcode80 {
    public int removeDuplicates(int[] nums) {

        // this is a two pointer approach, we can do this with single pointer also but
        // in that
        // case we will have an extra space of O(n)
        if (nums == null || nums.length == 0)
            return 0;

        int j = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
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

// tc--> O(n)
// sc-->(1)
