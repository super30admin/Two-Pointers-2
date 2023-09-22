// Time Complexity : O(n)
// Space Complexity : O
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/1056517092/
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * Maintain 2 pointers, fast and a slow pointer, initialise both to index 1
 * Traverse through the array and at each index check that the values at that index and prev index are same
 * For every 2 same values, update the slow pointer value to value at fast pointer
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums ==null || nums.length ==0)
            return 0;
        int j=1, count =1;
        for(int i=1; i< nums.length; i++){
            if(nums[i]==nums[i-1])
                count++;
            else
                count=1;
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
