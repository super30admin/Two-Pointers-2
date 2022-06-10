public class Problem1 {

    // Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
        // 1. Here the first intuition is to have a counter to know the number of same elements in a row
        // 2. next we need to also know at which location we already have k element and where is the next unique element available
     // 3. We can replace the next unique element with previously found location
    class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 2;
            int s = 1;
            //int f = 1;
            int c = 1;
            for (int f = 1; f < nums.length; f++) {
                if (nums[f] == nums[f - 1]) {
                    // incrementing the count since we found same element
                    c++;
                } else {
                    // found unique element
                    c = 1;
                }

                if (c <= k) {
                    // if c > k means to found extra elements and we want to now find the next unique element and replace the element at s with that unique element
                    nums[s] = nums[f];

                    // s will indicate that we have found of the k previous elements
                    s++;
                }
            }

            return s;
        }
    }
}

