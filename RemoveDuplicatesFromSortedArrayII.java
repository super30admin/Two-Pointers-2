// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Use two pointers i and j pointing the beginning of the array and initialize count as 1. If we get the current
// element same as previous element then update the count and if count is less than or equal to two copy nums[i] into 
// nums[j] else just increment i pointer.If we get current element not same as previous element then set count to 1.
// Continue this until we reach end of array. 

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int i=1;
        int j=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        return j;
    }
}