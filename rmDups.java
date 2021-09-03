// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes.
// Three line explanation of solution in plain english:
/*
    Iterate on the entire array and the inner while loop will check if the subsequent elements are same,
    if they are same, they will be added to the results array. Then the count is increased to find the next number and
    its duplicates. Important to note that we are allowed upto 2 duplicates.
*/

public class rmDups {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int idx = 0;
        int insertIdx = 0;

        while(idx < n) {
            int temp = idx;
            int tempCount = 0;

            while(temp < n && nums[idx] == nums[temp]){
                if (tempCount < 2) nums[insertIdx++] = nums[idx];
            temp++;
            tempCount++;
            }
            idx = temp;
        }
        return insertIdx;
    }
}
