// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        
        //we want to remove duplicates from the array, we cannot have more than k duplicates

        int n = nums.length;
        if(n == 1)
            return n;

        //we will use 2 pointer solution (slow and fast)
        int slow = 1;
        //number of duplicates, since we already checked first element hence 1
        int count = 1;

        //fast will keep on inc a
        for(int fast = 1; fast < n; fast++) {

            //check if its duplicate
            if(nums[fast] == nums[fast - 1]) {

                count++;
            }
            else {
                //if it is a new number 
                count = 1;
            }

            //if count <= k then we increment slow as well
            //We are storing duplicates in place
            if(count <= 2) {

                nums[slow] = nums[fast];
                slow++;
            }
        }

        //index at slow in length of result
        return slow;
    }
}