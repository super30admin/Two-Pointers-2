// Time Complexity : O(n) n is length of nums
// Space Complexity : O(1) no aux space used
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : have a running count and 2 pointers, if the ele exists more than 2, increment counter
// otherwise copy over the new element to slow pointer

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int j = 1, count = 1;


        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
