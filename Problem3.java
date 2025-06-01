// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english: Iterate thru array with floating Integer i & keep counting the occurances while updating the j only at 1st & 2nd occurances then move forward...

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1; // to iterate thru array
        int j = 1; // to track the valid elements & ignore dupes
        int count = 1; // count of occurances of jth index values

        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > 2) {
                    i++;
                    continue;
                }
            } else {
                count = 1;
            }
            nums[j] = nums[i];
            i++; 
            j++;
        }

        return j;
    }
}