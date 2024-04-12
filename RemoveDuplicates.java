
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class removeDuplicates {
    public int removeDuplicate(int[] nums) {
        int i = 0;
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            if (j == 0 || nums[j] != nums[j-1]) {
                count = 1;
            } else count++;

            if (count <= 2) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}