// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) { // to understand the no. of occurences of that element.
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) { // since problem wnats only 2 occurences.
                nums[j] = nums[i];
                j++;
            }
        }

        return j;

    }
}