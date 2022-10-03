#time complexity O(n)
space complexity O(1)
class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int j = 1;
        int i = 1;
        int count = 1;
        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[j] = 0 + nums[i];

                j++;
            }
            i++;
        }
        return j;
    }