//Time complexity: O(n)
//Space Complexity: O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for(int num: nums){

            if( i < 2 || num > nums[i-2]){  //checks current num with the ith index element so that it should occur atmost twice
                nums[i++] = num;  //updates the number atmost 2 times and i is the length to be specified as output
            }
        }
        return i;
    }
}
