// TIME: O(n)
// SPACE: O(1)
// SUCCESS on LeetCode

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int start = 0;
        boolean first = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[start] != nums[i]) {
                start = i;
                count++;
                nums[count] = nums[i];
                first = true;
            } else {
                if (first) {
                    count++;
                    nums[count] = nums[i];
                    first = false;
                }
            }
        }
        
        return count + 1;
    }
}
